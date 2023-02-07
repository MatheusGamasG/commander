package br.com.commander_backend.model;

import br.com.commander_backend.constants.WeekDay;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class Game {

    OffsetDateTime date;
    List<Player> players;
    WeekDay monthAssigned;
    BigDecimal arrecadatedAmount;

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

    public BigDecimal getArrecadatedAmount() {
        return arrecadatedAmount;
    }

    public void setArrecadatedAmount(BigDecimal arrecadatedAmount) {
        this.arrecadatedAmount = arrecadatedAmount;
    }
}
