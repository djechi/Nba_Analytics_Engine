package com.nba.sport_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nba.sport_data.entity.PlayerRatings;

public interface PlayerRatingsRepository extends JpaRepository<PlayerRatings, Long>{
}
