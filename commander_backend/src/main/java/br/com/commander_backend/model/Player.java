package br.com.commander_backend.model;

import java.math.BigDecimal;

public class Player {
    String name;
    List<Item> itemsConsumed;
    BigDecimal totalAmountConsumed;
    PaymentMethod paymentMethod;

}
