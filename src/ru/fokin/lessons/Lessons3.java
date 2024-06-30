package ru.fokin.lessons;

import java.util.Arrays;

public class Lessons3 {

    public static void main(String[] args) {
        int a = 0;
        String text = null;

        int age = 18;
        int age1 = 20;
        int age2 = 2;
        int age3 = 34;

        int [] ints = new int[4];
        System.out.println(Arrays.toString(ints));

        // Запись, конкретного элемента в массив
        ints[0] = age;
        ints[1] = age1;
        ints[2] = age2;
        ints[3] = age3;
        System.out.println(Arrays.toString(ints));
        System.out.println(ints[2]);
        System.out.println("Длинна массива: " + ints.length);

        System.out.println("--------------");

        int waterVolume = 10;
        while (waterVolume > 0) {
            System.out.println("Вытекает 1 мл");
            waterVolume--;
        }

        System.out.println("--------------");



    }
}
