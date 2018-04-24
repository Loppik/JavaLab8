package com.epam.echo.model.decorator;

import com.epam.echo.model.entity.Ornamentals;
import com.epam.echo.model.entity.Toy;

public class BoxToyDecorator extends BoxDecorator{
    public Toy []items = new Toy[5];

    public BoxToyDecorator(Box component, Toy toy) {
        super(component);
        this.items[0] = toy;
    }

    @Override
    public Ornamentals getOrnamental() {
        System.out.println(this.items[0].getWeight());
        super.add(this.items[0]);
        return super.getOrnamental();
    }
}
