package com.company;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    static <T> T randomElement(T[] array)
    {
        return array[getRandomIndex(array.length)];
    }
    static <T> T randomElement(ArrayList<T> arrayList)
    {
        return arrayList.get(getRandomIndex(arrayList.size()));
    }

    private static int getRandomIndex(int lenght)
    {
        Random rn = new Random();
        return rn.nextInt(lenght);
    }
}
