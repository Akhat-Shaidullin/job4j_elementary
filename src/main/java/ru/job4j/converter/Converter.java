package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {   /* формула перевода рубли в евро */
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {  /* формула перевода рубли в доллары */
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToDollar(float value) {  /* формула пары евро-доллар */
        float rsl = value * 1.17F;
        return rsl;
    }

    public static float dollarToEuro(float value) {  /* формула пары доллар-евро */
        float rsl = value * 0.85F;
        return rsl;
    }

    public static float euroToRuble(float value) {  /* формула перевода евро в рубли */
        float rsl = value / 0.014285F;
        return rsl;
    }

    public static float dollarToRuble(float value) {  /* формула перевода доллары в рубли */
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
        System.out.println("140 rubles are " + euro + " euro");       /* перевод рубли в евро */
        System.out.println("25 rubles are " + dollar + " dollar");    /* перевод рубли в доллары */
        System.out.println("20 euro are " + euroDollar + " dollar");  /* перевод евро в доллары */
        System.out.println("15 dollar are " + dollarEuro + " euro");  /* перевод доллары в евро */
        System.out.println("3 euro are " + euroRuble + " ruble");     /* перевод евро в рубли */
        System.out.println("1 dollar are " + dollarRuble + " ruble"); /* перевод доллары в рубли */
    }
}
