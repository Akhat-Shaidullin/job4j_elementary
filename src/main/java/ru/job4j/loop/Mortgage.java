package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double ost = amount;
        while (ost > 0) {
            ost = ost + (ost * (percent / 100));
            ost = ost - salary;
            year += 1;

        }
        return year;
    }
}