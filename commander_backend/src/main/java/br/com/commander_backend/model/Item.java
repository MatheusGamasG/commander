package br.com.commander_backend.model;

import java.math.BigDecimal;

public class Item {
    String name;
    Long unityValue;
    Integer quantityConsumed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUnityValue() {
        return unityValue;
    }

    public void setUnityValue(Long unityValue) {
        this.unityValue = unityValue;
    }

    public Integer getQuantityConsumed() {
        return quantityConsumed;
    }

    public void setQuantityConsumed(Integer quantityConsumed) {
        this.quantityConsumed = quantityConsumed;
    }
}
