package com.epam.echo.model.entity;

public class Tinsel extends Ornamentals{
    private String color, material;
    private int length;

    public Tinsel() {
        this.color = null;
        this.material = null;
        this.length = 0;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Tinsel " + super.toString() + ", color " + this.color + ", material " + this.material;
    }
}
