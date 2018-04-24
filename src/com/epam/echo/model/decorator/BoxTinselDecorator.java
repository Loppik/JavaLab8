package com.epam.echo.model.decorator;

import com.epam.echo.model.entity.Ornamentals;
import com.epam.echo.model.entity.Tinsel;

public class BoxTinselDecorator extends BoxDecorator {
    public Tinsel []items = new Tinsel[5];

    public BoxTinselDecorator(Box component, Tinsel tinsel) {
        super(component);
        this.items[0] = tinsel;
    }

    @Override
    public Ornamentals getOrnamental() {
        System.out.println(this.items[0].getWeight());
        super.add(this.items[0]);
        return super.getOrnamental();
    }
}
