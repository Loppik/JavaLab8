package com.epam.echo.model.logic;

import com.epam.echo.model.entity.*;

public class Counter {
    public static int countToys(ChristmasTree tree){
        int result = 0;
        for (Ornamentals o:tree.getItems()) {
            if(o instanceof Toy){
                result++;
            }
        }
        return result;
    }

    public static int countGarland(ChristmasTree tree){
        int result = 0;
        for (Ornamentals o:tree.getItems()) {
            if(o instanceof Garland){
                result++;
            }
        }
        return result;
    }

    //...

}
