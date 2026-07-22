package com.nba.sport_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nba.sport_data.entity.Players;

public interface PlayersRepository extends JpaRepository<Players, Long>{
}
