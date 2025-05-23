package com.projetopratico.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetopratico.dslist.dto.GameMinDTO;
import com.projetopratico.dslist.entities.Games;
import com.projetopratico.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO>  findAll(){
		var result = gameRepository.findAll();
		return result.stream().map(x  ->  new GameMinDTO(x)).toList();
	}
}
