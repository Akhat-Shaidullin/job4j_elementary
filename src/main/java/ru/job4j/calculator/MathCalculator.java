package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifferDivis(double first, double second) {
        return differ(first, second) + divis(first, second);
    }

    public static double sumSumMultiplyDifferDivis(double first, double second) {
        return sum(first, second) + multiply(first, second) + differ(first, second) + divis(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDifferDivis(30, 20));
        System.out.println("Результат расчета равен: " + sumSumMultiplyDifferDivis(10, 20));
    }
}
