package com.example.jpapracticie.jpapractice.entities;


import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
}
