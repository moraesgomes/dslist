package com.hmgomes.dslist.service;

import com.hmgomes.dslist.dto.GameDTO;
import com.hmgomes.dslist.dto.GameMinDTO;
import com.hmgomes.dslist.entities.Game;
import com.hmgomes.dslist.projections.GameMinProjection;
import com.hmgomes.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findALl(){
        List<Game> result = gameRepository.findAll();
        return  result.stream().map(x-> new GameMinDTO(x)).toList();


    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return  result.stream().map(x-> new GameMinDTO(x)).toList();


    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId){

        Game result = gameRepository.findById(gameId).get();
        return new GameDTO(result);

    }



}
