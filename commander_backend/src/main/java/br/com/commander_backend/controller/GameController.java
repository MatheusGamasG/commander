package br.com.commander_backend.controller;

import br.com.commander_backend.model.Game;
import br.com.commander_backend.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")

public class GameController {

    final private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/games")
    @ResponseStatus(HttpStatus.CREATED)
    public Game postGame(@RequestBody Game game) {

        return gameService.saveGame(game);
    }

    @GetMapping
    public String helloWorld() {

        return "hello world!"; 
    }
}
