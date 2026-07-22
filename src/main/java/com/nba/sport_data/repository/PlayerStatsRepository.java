package com.nba.sport_data.repository;

import com.nba.sport_data.entity.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Long>{ 
}
