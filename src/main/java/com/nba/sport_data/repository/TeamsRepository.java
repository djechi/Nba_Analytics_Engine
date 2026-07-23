package com.nba.sport_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nba.sport_data.entity.Teams;

public interface TeamsRepository extends JpaRepository<Teams, Long>{
}
