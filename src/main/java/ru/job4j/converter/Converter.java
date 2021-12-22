package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.17F;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.85F;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value / 0.014285F;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value / 0.01666F;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(25);
        float euroDollar = Converter.euroToDollar(20);
        float dollarEuro = Converter.dollarToEuro(15);
        float euroRuble = Converter.euroToRuble(3);
        float dollarRuble = Converter.dollarToRuble(1);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("25 rubles are " + dollar + " dollar");
        System.out.println("20 euro are " + euroDollar + " dollar");
        System.out.println("15 dollar are " + dollarEuro + " euro");
        System.out.println("3 euro are " + euroRuble + " ruble");
        System.out.println("1 dollar are " + dollarRuble + " ruble");
    }
}
