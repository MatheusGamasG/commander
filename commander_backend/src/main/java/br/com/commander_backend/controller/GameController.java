package br.com.commander_backend.controller;

import br.com.commander_backend.model.Game;
import br.com.commander_backend.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class GameController {

    final private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("games")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @PostMapping("games")
    @ResponseStatus(HttpStatus.CREATED)
    public void postGame(@RequestBody Game game) {
        gameService.saveGame(game);
    }
}
