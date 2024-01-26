package com.example.testbenaissaferes.dao.repositories;

import com.example.testbenaissaferes.dao.entites.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    Menu findByLibelleMenu(String libelleMenu);
}
