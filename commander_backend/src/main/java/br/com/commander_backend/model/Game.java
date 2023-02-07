package br.com.commander_backend.model;

import br.com.commander_backend.constants.WeekDayENUM;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class Game {

    OffsetDateTime date;
    List<Player> players;
    WeekDayENUM monthAssigned;
    BigDecimal arrecadatedAmount;


}
