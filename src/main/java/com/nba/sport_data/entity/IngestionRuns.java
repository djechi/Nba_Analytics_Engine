package com.nba.sport_data.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="ingestion_runs")
public class IngestionRuns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;
    private String status;
    private Integer gamesProcessed;
}
