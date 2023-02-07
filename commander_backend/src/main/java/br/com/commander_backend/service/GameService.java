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
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

@Service
public class GameService {

    final private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game saveGame(Game game) {

        if(Objects.isNull(game.getDate())) {
            game.setDate(LocalDate.now());
        }

        Long arrecadated = 0L;

        for(Player player : game.getPlayers()) {
            arrecadated += player.getTotalAmountConsumed();
        }

        game.setArrecadatedAmount(arrecadated);

        return gameRepository.saveGame(game);
    }

}
