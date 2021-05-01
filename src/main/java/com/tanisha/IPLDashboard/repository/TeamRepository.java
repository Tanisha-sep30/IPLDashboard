package com.tanisha.IPLDashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.tanisha.IPLDashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);

}
