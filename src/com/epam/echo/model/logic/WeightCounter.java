package com.epam.echo.model.logic;

import com.epam.echo.model.entity.*;

public class WeightCounter {

    public static int getWeightOfTree(ChristmasTree tree){
        int sum = 0;
        for (Ornamentals o:tree.getItems()) {
            sum += o.getWeight();
        }
        return sum;
    }

}
