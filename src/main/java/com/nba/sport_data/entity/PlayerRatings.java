package com.nba.sport_data.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="player_ratings")
public class PlayerRatings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Players player;

    private double offRating;
    private double defRating;
    private double ovrRating;
    private LocalDate date;
}
