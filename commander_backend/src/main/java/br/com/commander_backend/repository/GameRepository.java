package br.com.commander_backend.repository;

import br.com.commander_backend.constants.ApiConstants;
import br.com.commander_backend.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

import static br.com.commander_backend.constants.ApiConstants.COLLECTION_NAME;

@Repository
public class GameRepository {

    final private MongoOperations mongoOperations;

    @Autowired
    public GameRepository(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public List<Game> getAllGames() {
        return mongoOperations.findAll(Game.class, COLLECTION_NAME);
    }

    public Game saveGame(Game game) {
        return mongoOperations.save(game, COLLECTION_NAME);
    }


}
