package com.epam.echo.model.util;

import com.epam.echo.model.Numbers;

public class CreatorTwo {
    private CreatorTwo() {};

    public static Object getInstance(Numbers number) {
        switch(number) {
            case ZERO: { System.out.println("Zero"); break; }
            case ONE: { System.out.println("One"); break; }
            case TWO: { System.out.println("Two"); break; }
        }
        return new Object();
    }
}
