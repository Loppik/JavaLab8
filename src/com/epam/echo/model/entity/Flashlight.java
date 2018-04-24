package com.epam.echo.model.entity;

import com.epam.echo.model.entity.Ornamentals;

public class Flashlight extends Ornamentals{
    private int energyConsumption;
    private String color;
    public Flashlight() {
        this.energyConsumption = 0;
        this.color = null;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Flashlight " + super.toString() + ", energy consuption " + this.energyConsumption + ", color " + this.color + "\n";
    }
}

