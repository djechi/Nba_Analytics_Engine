package com.nba.sport_data.entity;

import jakarta.persistence.*;

@Entity
@Table(name="players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String team;
    private String pos;
}
