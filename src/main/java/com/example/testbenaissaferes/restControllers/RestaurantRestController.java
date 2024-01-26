package com.example.testbenaissaferes.restControllers;

import com.example.testbenaissaferes.dao.entites.Client;
import com.example.testbenaissaferes.dao.entites.Restaurant;
import com.example.testbenaissaferes.services.client.IClientService;
import com.example.testbenaissaferes.services.restaurant.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("restaurant")
public class RestaurantRestController {
IRestaurantService iRestaurantService;
    @PostMapping("addRestaurantEtMenus")
    public Restaurant addRestaurantEtMenus(@RequestBody Restaurant restaurant ){
        return iRestaurantService.ajouterRestaurantEtMenusAssocie(restaurant);
    }
}
