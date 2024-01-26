package com.example.testbenaissaferes.services.client;

import com.example.testbenaissaferes.dao.entites.Client;
import com.example.testbenaissaferes.dao.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService  implements IClientService{
    ClientRepository clientRepository;
    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }
}
