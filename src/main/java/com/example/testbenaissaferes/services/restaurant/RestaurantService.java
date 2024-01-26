package com.example.testbenaissaferes.services.restaurant;

import com.example.testbenaissaferes.dao.entites.Restaurant;
import com.example.testbenaissaferes.dao.repositories.ClientRepository;
import com.example.testbenaissaferes.dao.repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantService implements IRestaurantService{
    RestaurantRepository restaurantRepository;
    @Override
    public Restaurant ajouterRestaurantEtMenusAssocie(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
}
