package com.nba.sport_data.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="games")
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private Teams homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private Teams awayTeam;

    private LocalDate date;
    private Integer homeScore;
    private Integer awayScore;
}
