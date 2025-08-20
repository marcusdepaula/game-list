package com.gamelist.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamelist.backend.dto.GameDTO;
import com.gamelist.backend.dto.GameMinDTO;
import com.gamelist.backend.entities.Game;
import com.gamelist.backend.projections.GameMinProjection;
import com.gamelist.backend.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	//ideal seria ter tratamento de excecao para casos de nao existir o id
	//acid
	@Transactional(readOnly = true)
	public GameDTO findByID(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
