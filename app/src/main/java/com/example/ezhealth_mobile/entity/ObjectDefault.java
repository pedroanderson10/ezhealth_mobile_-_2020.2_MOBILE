package com.example.ezhealth_mobile.entity;

public class ObjectDefault {

    private String name;
    private String quantity;
    private String quantityMeasure;
    private String kcal;

    public ObjectDefault(String name, String quantity, String quantityMeasure, String kcal) {
        this.name = (name != null)? name : "Not named";
        this.quantity = (quantity != null && Integer.parseInt(quantity) >= 0)? quantity : "0";
        this.quantityMeasure = (quantityMeasure != null)? quantityMeasure : "qtd";
        this.kcal = (kcal != null && Integer.parseInt(kcal) >= 0)? kcal : "0";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantityMeasure() {
        return quantityMeasure;
    }

    public void setQuantityMeasure(String quantityMeasure) {
        this.quantityMeasure = quantityMeasure;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }
}
