package com.example.testbenaissaferes.dao.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idRestaurant ;
    String nom;
    long nbPlaceMax;

    @OneToMany(cascade = CascadeType.PERSIST)
    List<Menu> menus;


}
