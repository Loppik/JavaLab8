package com.epam.echo.model.util;

import com.epam.echo.model.Items;
import com.epam.echo.model.entity.*;


public class Creator {
    private static Creator unique;

    private Creator() {
        Items item;
    }

    public static Creator getUnique() {
        if (unique == null) {
            unique = new Creator();
        }
        return unique;
    }

    public static Ornamentals create(Items toy) throws IllegalArgumentException {
        Ornamentals object = null;
        switch (toy) {
            case FLASHLIGHT : { object = new Flashlight(); break;}
            case GARLAND:  { object = new Garland(); break;}
            case TINSEL:  { object = new Tinsel(); break;}
            case TOY: { object = new Toy(); break;}
        }
        return object;
    }
}
