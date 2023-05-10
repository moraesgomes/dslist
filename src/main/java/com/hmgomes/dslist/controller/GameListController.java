package com.hmgomes.dslist.controller;

import com.hmgomes.dslist.dto.GameDTO;
import com.hmgomes.dslist.dto.GameListDTO;
import com.hmgomes.dslist.dto.GameMinDTO;
import com.hmgomes.dslist.service.GameListService;
import com.hmgomes.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findALl();
        return result;

    }


}
