package br.com.commander_backend.model;

import br.com.commander_backend.constants.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public class Player {
    String name;
    List<Item> itemsConsumed;
    BigDecimal totalAmountConsumed;
    PaymentMethod paymentMethod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItemsConsumed() {
        return itemsConsumed;
    }

    public void setItemsConsumed(List<Item> itemsConsumed) {
        this.itemsConsumed = itemsConsumed;
    }

    public BigDecimal getTotalAmountConsumed() {
        return totalAmountConsumed;
    }

    public void setTotalAmountConsumed(BigDecimal totalAmountConsumed) {
        this.totalAmountConsumed = totalAmountConsumed;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
