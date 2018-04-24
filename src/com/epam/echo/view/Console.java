package com.epam.echo.view;

import java.util.Scanner;

public class Console {
    private static Scanner input;
    static { input = new Scanner(System.in); }

    public static void print(String msg) {
        System.out.print(msg);
    }

    public static Integer inputInt(String msg) {
        while(true) {
            print(msg);
            if (input.hasNextInt()) {
                return input.nextInt();
            }
        }
    }

    public static String input(String msg) {
        print(msg);
        return input.nextLine();
    }
}
