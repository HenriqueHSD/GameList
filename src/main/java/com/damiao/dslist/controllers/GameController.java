package com.damiao.dslist.controllers;

import com.damiao.dslist.dto.GameDTO;
import com.damiao.dslist.dto.GameMinDTO;
import com.damiao.dslist.entities.Game;
import com.damiao.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;

    }

    @GetMapping
    public List<GameMinDTO> fingAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }

}
