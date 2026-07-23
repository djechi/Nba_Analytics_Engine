package com.nba.sport_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nba.sport_data.entity.Games;

public interface GamesRepository extends JpaRepository<Games, Long>{
}
