package com.hmgomes.dslist.service;

import com.hmgomes.dslist.dto.GameDTO;
import com.hmgomes.dslist.dto.GameListDTO;
import com.hmgomes.dslist.dto.GameMinDTO;
import com.hmgomes.dslist.entities.Game;
import com.hmgomes.dslist.entities.GameList;
import com.hmgomes.dslist.repository.GameListRepository;
import com.hmgomes.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findALl(){
        List<GameList> result = gameListRepository.findAll();
        return  result.stream().map(x-> new GameListDTO(x)).toList();


    }



}
