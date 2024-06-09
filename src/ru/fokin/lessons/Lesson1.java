package ru.fokin.lessons;

public class Lesson1 {
    public static void main(String[] args) {

        // Булево значение (истина/ложь)
        boolean isGoShop = true; // 1
        boolean isNoShop = false; // 0

        // Целые числа

        // bit - кусочек, число от 0 до 1
        // byte - состоит из 8 бит
        // 2 4 8 16 32 64 128 256
        // 0 - 255
        // -128 - 0 - 127
        byte ipAddressFirst = -128;

        // short - состоит из 2 byte
        // 16 bit
        // 256 * 256
        // 0 - 65535
        // -32768 - 0 - 32767
        short shortType = 32767;

        // int - состоит 4 byte
        // 32 bit
        // 256 * 256 * 256 * 256
        // -2 147 483 648 - 0 - 2 147 483 647
        int countPeopleChina = 2_147_483_647;

        // long - состоит из 8 byte
        // 64 bit
        long countWorldPeople = 8_000_000_000L;

        // Числа с плавающей точкой

        // float
        // 32 bit
        float cola = 0.12345678901234567890F;
        //System.out.println(cola);

        // double
        // 64 bit
        double atom = 0.12345678901234567890;
        //System.out.println(atom);

        int apple = 5;
        apple = apple + 1;
        //System.out.println(apple);

        // String
        String name = "Artem";
        String name2 = new String("Artem");
        // Сравнение строк
        System.out.println(name.equals(name2));
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        System.out.println(name);

    }
}