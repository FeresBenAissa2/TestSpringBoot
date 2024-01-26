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
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idMenu;
    String libelleMenu;
    @Enumerated(EnumType.STRING)
    TypeMenu typeMenu;
    float prixTotal;

    @OneToMany(mappedBy = "menu",cascade = CascadeType.ALL)
    List<Composant> composants;
    @ManyToMany(mappedBy = "menus",cascade = CascadeType.ALL)
    List<Client> clients;
}
