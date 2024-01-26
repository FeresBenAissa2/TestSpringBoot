package com.example.testbenaissaferes.services.menu;

import com.example.testbenaissaferes.dao.entites.Client;
import com.example.testbenaissaferes.dao.entites.Composant;
import com.example.testbenaissaferes.dao.entites.Menu;
import com.example.testbenaissaferes.dao.repositories.ClientRepository;
import com.example.testbenaissaferes.dao.repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MenuService implements IMenuService{
    MenuRepository menuRepository;
    ClientRepository clientRepository;
    @Override
    public Menu ajouterComposantsEtMiseAJourPrixTotalMenu(List<Composant> composants, long idMenu) {
        Menu menu = menuRepository.findById(idMenu).orElseThrow(() -> new RuntimeException("Menu not found with id: " + idMenu));

        List<Composant> currentComposants = menu.getComposants();
        currentComposants.addAll(composants);
        menu.setComposants(currentComposants);

        float prixTotal = currentComposants.stream().map(Composant::getPrix).reduce(0f, Float::sum);

        menu.setPrixTotal(prixTotal);
        return menuRepository.save(menu);
    }

    @Override
    public void affecterClientAuMenu(String identifiant, String libelleMenu) {
        // error can occur when identifiant or libelleMenu return more than one element,
        // lezem nbadel fazet
        Client client = clientRepository.findByIdentifiant(identifiant);
        Menu menu = menuRepository.findByLibelleMenu(libelleMenu);

        List<Menu> clientMenus = client.getMenus();
        clientMenus.add(menu);
        client.setMenus(clientMenus);

        List<Client> menuClients = menu.getClients();
        menuClients.add(client);
        menu.setClients(menuClients);

        clientRepository.save(client);
        menuRepository.save(menu);
    }

}
