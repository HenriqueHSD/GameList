package com.damiao.dslist.controllers;

import com.damiao.dslist.dto.GameListDTO;
import com.damiao.dslist.dto.GameMinDTO;
import com.damiao.dslist.services.GameListService;
import com.damiao.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> fingAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;

    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> fingBylist(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;

    }

}
