package com.projetopratico.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopratico.dslist.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long> {

}
