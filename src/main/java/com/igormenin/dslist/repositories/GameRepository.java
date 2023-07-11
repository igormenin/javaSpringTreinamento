package com.igormenin.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igormenin.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
