package com.example.testbenaissaferes.dao.repositories;

import com.example.testbenaissaferes.dao.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findByIdentifiant(String identifiant);
}
