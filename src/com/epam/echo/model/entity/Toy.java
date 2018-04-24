package com.epam.echo.model.entity;

public class Toy extends Ornamentals{
    private int diameter;

    public Toy() {
        this.diameter = 0;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Toy " + super.toString() + ", diameter " + this.diameter;
    }
}
