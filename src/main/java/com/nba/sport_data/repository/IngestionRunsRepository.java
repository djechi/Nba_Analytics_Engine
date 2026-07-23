package com.nba.sport_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nba.sport_data.entity.IngestionRuns;

public interface IngestionRunsRepository extends JpaRepository<IngestionRuns, Long>{
}
