package com.epam.echo.model.entity;

public abstract class Ornamentals {
    private int weight;
    private int price;

    public Ornamentals(){
        this.weight = 0;
        this.price = 0;
    }


    @Override
    public String toString() {
        return "weight " + this.weight + ", price " + this.price;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Ornamentals && this.weight == ((Ornamentals) obj).getWeight();
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) { this.weight = weight; }

    public int getWeight() {
        return this.weight;
    }

}
