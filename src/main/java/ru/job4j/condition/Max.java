package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean lr = left > right;
        int result = lr ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int msg = Max.max(1, 2);
        System.out.println(msg);
    }
}
