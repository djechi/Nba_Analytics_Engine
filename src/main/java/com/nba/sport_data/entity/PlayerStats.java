package com.nba.sport_data.entity;

import jakarta.persistence.*;

@Entity
@Table(name="player_stats")
public class PlayerStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Players player;
    
    private Integer points;
    private Integer assists;
    private Integer offRebs;
    private Integer defRebs;
    private Integer steals;
    private Integer blocks;
    private Integer turnovers;
    private Integer fgMade;
    private Integer fgAtmpt;
    private Integer threePtrsMade;
    private Integer threePtrsAtmpt;
}
