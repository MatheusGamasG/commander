package br.com.commander_backend.model;

import java.math.BigDecimal;

public class Item {
    String name;
    BigDecimal unityValue;
    Integer quantityConsumed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnityValue() {
        return unityValue;
    }

    public void setUnityValue(BigDecimal unityValue) {
        this.unityValue = unityValue;
    }

    public Integer getQuantityConsumed() {
        return quantityConsumed;
    }

    public void setQuantityConsumed(Integer quantityConsumed) {
        this.quantityConsumed = quantityConsumed;
    }
}
