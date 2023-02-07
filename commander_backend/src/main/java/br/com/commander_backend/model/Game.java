package br.com.commander_backend.model;

import br.com.commander_backend.constants.Month;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
public class Game {
    @Id
    private String id;

    private LocalDate date;
    private List<Player> players;
    private Month monthAssigned;
    private Long arrecadatedAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Month getMonthAssigned() {
        return monthAssigned;
    }

    public void setMonthAssigned(Month monthAssigned) {
        this.monthAssigned = monthAssigned;
    }

    public Long getArrecadatedAmount() {
        return arrecadatedAmount;
    }

    public void setArrecadatedAmount(Long arrecadatedAmount) {
        this.arrecadatedAmount = arrecadatedAmount;
    }
}
