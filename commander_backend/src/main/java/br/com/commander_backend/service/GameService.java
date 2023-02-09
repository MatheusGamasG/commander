package br.com.commander_backend.service;

import br.com.commander_backend.constants.Month;
import br.com.commander_backend.model.Game;
import br.com.commander_backend.model.Item;
import br.com.commander_backend.model.Player;
import br.com.commander_backend.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
public class GameService {

    final private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public void saveGame(Game game) {

        if(Objects.isNull(game.getDate())) {
            game.setDate(LocalDate.now());
        }

        Integer month = game.getDate().getMonthValue();
        game.setMonthAssigned(Month.values()[month - 1]);

        BigDecimal arrecadated = BigDecimal.ZERO;

        for(Player player : game.getPlayers()) {
            BigDecimal playerTotalAmountConsumed = BigDecimal.ZERO;

            for(Item item : player.getItemsConsumed()) {
                BigDecimal itemTotalValue = item.getUnityValue().multiply(BigDecimal.valueOf(item.getQuantityConsumed()));
                playerTotalAmountConsumed = playerTotalAmountConsumed.add(itemTotalValue);

            }

            player.setTotalAmountConsumed(playerTotalAmountConsumed);
            arrecadated = arrecadated.add(player.getTotalAmountConsumed());
        }

        game.setArrecadatedAmount(arrecadated);
        gameRepository.saveGame(game);
    }

    public List<Game> getAllGames() {
        return gameRepository.getAllGames();
    }
}
