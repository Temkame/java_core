package ru.fokin.lessons;

public class Lesson2 {
    public static void main(String[] args) {
        int money = 40;
        int priceBreed = 50;
        int milk = 20;
        boolean condition = priceBreed < 40;
        if (priceBreed <= money) {
            System.out.println("Покупаю хлеб");
        } else if (milk <= money) {
            System.out.println("Покупаю молоко");
        } else {
            System.out.println("Хлеб не покупаю");
        }

        // Операторы числового сравнения
        // > - больше
        // < - меньше
        // >= - больше или равно
        // <= - меньше или равно
        // == - ровно такое же число
        // != - число не равно второму числу

        // && - Логическое "и" - два условия должны быть true, иначе false
        if (milk == 30 && priceBreed == 20) {
        //    System.out.println("Покупаю и хлеб и молока");
        }

        // || - Логическое или - одно из условий должно быть true -> тогда true, иначе false

        int childAge = 5;
        int childAge2 = 10;
        int childAge3 = 15;
        //  (fslse)          || (false)           || (false)
        if ((childAge >= 18) || (childAge2 >= 18) || (childAge3 >= 18)) {
            System.out.println("Открываю шампанское");
        }

        // Логическое "не" - переворачивает значение
        boolean isGoToSchol = !true;
        System.out.println(isGoToSchol);

        String name = new String("Артем");
        if (!name.contains("А")) {
            System.out.println("Имя не содержит букву А");
        } else {
            System.out.println("Имя содержит букву А");
        }

        String text = null;
        text.contains("А");
        System.out.println(text);

        System.out.println("ДОПОЛНИЛ ТЕКСТ");
    }
}
