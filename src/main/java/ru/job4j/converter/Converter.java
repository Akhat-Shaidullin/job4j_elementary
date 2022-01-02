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

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float euroRuble = Converter.euroToRuble(3);
        float dollarRuble = Converter.dollarToRuble(1);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("120 rubles are " + dollar + " dollar");
        System.out.println("3 euro are " + euroRuble + " ruble");
        System.out.println("1 dollar are " + dollarRuble + " ruble");

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
        in = 3;
        expected = 210;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("3 euro are 210. Test result : " + passed);
        in = 1;
        expected = 60;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("1 dollar are 60. Test result : " + passed);
    }
}