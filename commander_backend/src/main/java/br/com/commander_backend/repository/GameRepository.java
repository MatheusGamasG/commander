package br.com.commander_backend.repository;

import br.com.commander_backend.constants.ApiConstants;
import br.com.commander_backend.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import static br.com.commander_backend.constants.ApiConstants.COLLECTION_NAME;

@Repository
public class GameRepository {

    final private MongoOperations mongoOperations;

    @Autowired
    public GameRepository(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public Game saveGame(Game game) {
        return mongoOperations.save(game, COLLECTION_NAME);
    }

}
