package br.com.commander_backend.service;

import br.com.commander_backend.model.Game;
import br.com.commander_backend.model.Player;
import br.com.commander_backend.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

@Service
public class GameService {

    final private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game saveGame(Game game) {
        LocalDate now = LocalDate.now();
        game.setDate(now);
        Long arrecadated = 0L;

        for(Player player : game.getPlayers()) {
            arrecadated += player.getTotalAmountConsumed();
        }

        game.setArrecadatedAmount(arrecadated);

        return gameRepository.saveGame(game);
    }

}
