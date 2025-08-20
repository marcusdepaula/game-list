package com.gamelist.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamelist.backend.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
