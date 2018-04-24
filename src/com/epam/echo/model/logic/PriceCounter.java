package com.epam.echo.model.logic;

import com.epam.echo.model.entity.ChristmasTree;
import com.epam.echo.model.entity.Ornamentals;

public class PriceCounter {
    public static int getPrice(ChristmasTree tree) {
        int price = 0;
        for(Ornamentals ornamental : tree.getItems()) {
            price += ornamental.getPrice();
            System.out.println(price);
        }
        return price;
    }
}
