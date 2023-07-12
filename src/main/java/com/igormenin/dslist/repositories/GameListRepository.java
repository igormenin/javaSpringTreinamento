package com.igormenin.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igormenin.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
