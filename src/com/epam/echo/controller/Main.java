package com.epam.echo.controller;

import com.epam.echo.model.Numbers;
import com.epam.echo.model.collection.List;
import com.epam.echo.model.collection.Queue;
import com.epam.echo.model.collection.Stack;
import com.epam.echo.model.entity.Ornamentals;
import com.epam.echo.model.util.Creator;
import com.epam.echo.model.Items;
import com.epam.echo.model.util.CreatorTwo;
import com.epam.echo.view.Console;

import java.util.Arrays;

public class Main {
    /*public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTree(10, 3);
        FlashlightFactory flashlightFactory = new FlashlightFactory();
        flashlightFactory.setWeight(15);
        flashlightFactory.setColor("Red");
        flashlightFactory.setEnergyConsumption(4);
        flashlightFactory.setPrice(1);
        Ornamentals flashlight1 = flashlightFactory.createOrnamental();
        flashlightFactory.setPrice(5);
        flashlightFactory.setWeight(13);
        flashlightFactory.setColor("Yellow");
        Ornamentals flashlight2 = flashlightFactory.createOrnamental();

        GarlandFactory garlandFactory = new GarlandFactory();
        garlandFactory.setPrice(10);
        garlandFactory.setWeight(1);
        garlandFactory.setLights((Flashlight) flashlight1, (Flashlight) flashlight2);

        Ornamentals garland = garlandFactory.createOrnamental();

        TinselFactory tinselFactory = new TinselFactory();
        tinselFactory.setColor("Green");
        tinselFactory.setLength(14);
        tinselFactory.setMaterial("qwerty");
        tinselFactory.setPrice(9);
        tinselFactory.setWeight(20);
        Ornamentals tinsel1 = tinselFactory.createOrnamental();


        tree.addItem(garland);
        tree.addItem(tinsel1);
        System.out.println(tree);

        System.out.println(PriceCounter.getPrice(tree));

    }*/

    /*public static void main(String[] args) {
        System.out.println(Arrays.toString(Items.values()));
        String name = Console.input("What would u like to create: ");
        try {
            Ornamentals n = Creator.getUnique().create(Items.valueOf(name.toUpperCase()));
            System.out.println(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getStackTrace());
        }
    }*/

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        stack.printAll();

        /*Queue<Integer> queue = new Queue<>();
        for(int i = 1; i <= 10; i++) {
            queue.add(i);
        }
        queue.printAll();*/

        /*List<Integer> list = new List<>();
        for(int i = 1; i <= 10; i++) {
            list.push(i);
        }
        list.printAll();*/


    }
}
