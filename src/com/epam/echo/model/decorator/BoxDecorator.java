package com.epam.echo.model.decorator;

import com.epam.echo.model.entity.Ornamentals;

import java.util.ArrayList;

public abstract class BoxDecorator implements Box{
    public Box component;

    public ArrayList<Ornamentals> items = new ArrayList<>();

    public BoxDecorator(Box component) {
        this.component = component;
    }

    public void add(Ornamentals ornamentals) {
        items.add(ornamentals);
    }

    @Override
    public Ornamentals getOrnamental() {
        System.out.println("Hello");
        return component.getOrnamental();
    }
}
