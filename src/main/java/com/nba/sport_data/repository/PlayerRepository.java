package com.nba.sport_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nba.sport_data.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{
}
