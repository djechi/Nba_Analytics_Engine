package com.nba.sport_data.entity;

import jakarta.persistence.*;

@Entity
@Table(name="teams")
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
