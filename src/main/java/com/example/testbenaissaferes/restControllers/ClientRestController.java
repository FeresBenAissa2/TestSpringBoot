package com.example.testbenaissaferes.restControllers;

import com.example.testbenaissaferes.dao.entites.Client;
import com.example.testbenaissaferes.services.client.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("client")

public class ClientRestController {
    IClientService iClientService;
    @PostMapping("addClient")
    public Client addClient(@RequestBody Client client ){
        return iClientService.addClient(client);
    }

}
