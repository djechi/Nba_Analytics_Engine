package com.nba.sport_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nba.sport_data.entity.Players;

public interface GamesRepository extends JpaRepository<Players, Long>{
}
