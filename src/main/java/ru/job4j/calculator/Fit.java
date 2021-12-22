package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short manHeight) {
        double rsl = (manHeight - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short womanHeight) {
        double rsl = (womanHeight - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 187;
        short womanHeight = 164;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 164 is " + woman);
    }
}
