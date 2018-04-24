package com.epam.echo.model.logic;

import com.epam.echo.model.entity.ChristmasTree;
import com.epam.echo.model.entity.Ornamentals;

public class Sorter {
    private static void sortByWeight(ChristmasTree tree, int start, int end) {
        Ornamentals[] array = tree.getItems();
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = (i + j) / 2;
        while (i < j) {
            while (i < cur && (array[i].getWeight() <= array[cur].getWeight())) {
                i++;
            }
            while (j > cur && (array[cur].getWeight() <= array[j].getWeight())) {
                j--;
            }
            if (i < j) {
                tree.chandeTwoElements(i, j);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        sortByWeight(tree, start, cur);
        sortByWeight(tree, cur + 1, end);
    }
}
