package com.example.testbenaissaferes.dao.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idComposant;
    String nomComposant;
    float prix;

    @ManyToOne
    Menu menu;

}
