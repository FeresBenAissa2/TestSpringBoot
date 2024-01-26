package com.example.testbenaissaferes.dao.repositories;

import com.example.testbenaissaferes.dao.entites.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}
