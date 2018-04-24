package com.epam.echo.model.entity;

public class ChristmasTree {
    private Ornamentals[] items;
    private int weight, limit;

    public ChristmasTree(){
        this.limit = 0;
        this.weight = 0;
    }

    public int getWeight() {
        return weight;
    }

    public int getAmountOfOrnamentals() {
        return this.items.length;
    }

    public Ornamentals[] getItems(){
        return items;
    }

    public void setItems(Ornamentals[] items){
        this.items = items;
    }

    public int getLimit() {
        return limit;
    }

    public void addItem(Ornamentals item){
        if (this.getAmountOfOrnamentals() + 1 < this.limit) {
            Ornamentals[] temp = new Ornamentals[this.getAmountOfOrnamentals() + 1];
            System.arraycopy(this.items, 0, temp, 0, this.getAmountOfOrnamentals());
            temp[this.getAmountOfOrnamentals()] = item;
            this.items = temp;
            this.weight += item.getWeight();
        }
    }

    public void chandeTwoElements(int index1, int index2){
        Ornamentals temp = this.items[index1];
        this.items[index1] = this.items[index2];
        this.items[index2] = temp;
    }

    @Override
    public String toString() {
        String str = "Christmas tree " + this.weight + "kg, limit of toys " + this.limit + ":\n";
        for(Ornamentals o : this.getItems()) {
            str += o.toString();
        }
        return str;
    }
}
