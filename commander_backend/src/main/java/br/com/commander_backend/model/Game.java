package br.com.commander_backend.model;

import br.com.commander_backend.constants.WeekDay;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

@Document
public class Game {
    @Id
    String id;
    OffsetDateTime date;
    List<Player> players;

    WeekDay monthAssigned;
    Long arrecadatedAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public WeekDay getMonthAssigned() {
        return monthAssigned;
    }

    public void setMonthAssigned(WeekDay monthAssigned) {
        this.monthAssigned = monthAssigned;
    }

    public Long getArrecadatedAmount() {
        return arrecadatedAmount;
    }

    public void setArrecadatedAmount(Long arrecadatedAmount) {
        this.arrecadatedAmount = arrecadatedAmount;
    }
}
