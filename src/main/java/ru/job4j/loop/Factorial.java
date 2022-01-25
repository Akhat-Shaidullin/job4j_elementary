package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        int first = 1;
        for (result = first; first <= n; first++) {
            result = result * first;
        }
        return result;
    }
}