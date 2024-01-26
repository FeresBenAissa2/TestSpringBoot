package com.example.testbenaissaferes.restControllers;

import com.example.testbenaissaferes.dao.entites.Composant;
import com.example.testbenaissaferes.dao.entites.Menu;
import com.example.testbenaissaferes.dao.entites.Restaurant;
import com.example.testbenaissaferes.services.menu.IMenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("menu")
public class MenuRestController {

    IMenuService iMenuService;
    @PostMapping("addComposantsAndUpdateTotalMenu")
    public Menu addComposantsAndUpdateTotalMenu(@RequestBody List<Composant> composants,@RequestBody long idMenu ){
        return iMenuService.ajouterComposantsEtMiseAJourPrixTotalMenu(composants,idMenu);
    }
    @PostMapping("affecterClientToMenu")
    public void affectClientAuMenu(@RequestBody String identifiant,@RequestBody String libelleMenu ){
        iMenuService.affecterClientAuMenu(identifiant, libelleMenu);
    }
}
