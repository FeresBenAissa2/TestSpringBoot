package com.example.testbenaissaferes.services.menu;

import com.example.testbenaissaferes.dao.entites.Composant;
import com.example.testbenaissaferes.dao.entites.Menu;

import java.util.List;

public interface IMenuService {
    Menu ajouterComposantsEtMiseAJourPrixTotalMenu(List<Composant> composants, long idMenu);
    void affecterClientAuMenu(String identifiant,String libelleMenu);
}
