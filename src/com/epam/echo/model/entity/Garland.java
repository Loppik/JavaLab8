package com.epam.echo.model.entity;

public class Garland extends Ornamentals{
    private Flashlight[] lights;
    private int energyConsumption;

    public Garland() {
//        this.lights = lights;
//        for (Flashlight f:lights) {
//            this.energyConsumption += f.getEnergyConsumption();
//        }
//        for (Flashlight f:lights) {
//            this.setPrice(this.getPrice() + f.getPrice());
//        }
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public Flashlight[] getLights() {
        return lights;
    }

    public int getAmountOfLights(){
        return this.lights.length;
    }

    public static int getLightsWeight(Flashlight[] lights) {
        int weight = 0;
        for (Flashlight f: lights) {
            weight += f.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        String str = "Garland lights:\n";
        for(Flashlight fl : this.getLights()) {
            str += "\t" + fl.toString();
        }
        return str;
    }
}
