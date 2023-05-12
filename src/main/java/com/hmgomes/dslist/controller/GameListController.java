package com.hmgomes.dslist.controller;

import com.hmgomes.dslist.dto.GameDTO;
import com.hmgomes.dslist.dto.GameListDTO;
import com.hmgomes.dslist.dto.GameMinDTO;
import com.hmgomes.dslist.dto.ReplacementDTO;
import com.hmgomes.dslist.service.GameListService;
import com.hmgomes.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findALl();
        return result;

    }

    @GetMapping(value = "/{listid}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listid){
        List<GameMinDTO> result = gameService.findByList(listid);
        return result;

    }

    @PostMapping (value = "/{listid}/replacement")
    public void move(@PathVariable Long listid ,@RequestBody ReplacementDTO body){
        gameListService.move(listid,body.getSourceIndex(),body.getDestinationIndex());

    }
}
