package com.chillsoba.restapi.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Chair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "material", length = 50, nullable = false, unique = false)
    private String material;

    @Column(name = "colour", length = 50, nullable = false, unique = false)
    private String colour;

    @Column(name = "size", length = 50, nullable = false, unique = false)
    private String size;
}


