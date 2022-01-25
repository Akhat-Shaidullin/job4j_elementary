package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (sum = start; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        int first = 0;
        for (first = start; start <= finish; first++) {
            if (first % 2 == 0) {
                sum = sum + first;
            }
        }
        return sum;
    }
}
