package ru.geekbrains.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
        Map<Integer, String> collection = new TreeMap<>();
        collection.put(1, "I");
        collection.put(5, "V");
        collection.put(10, "X");
        collection.put(50, "L");
        collection.put(100, "C");
        collection.put(500, "D");
        collection.put(1000, "M");
        Map<Integer, String> newMap = new TreeMap<>(collection).descendingMap();
        StringBuilder st = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ЧИСЛО: ");
        int number = scanner.nextInt();
        changeNumber(newMap, number,  st);
    }

    public static void changeNumber(Map<Integer, String> newMap, int number, StringBuilder st) {
        int countPovtorZnach;
        int ostatok;
        for (Integer integer : newMap.keySet()) {
            countPovtorZnach = number / integer;
            if (countPovtorZnach > 0) {
                int i = 0;
                while (i < countPovtorZnach) {
                    st.append(newMap.get(integer));
                    i++;
                }
                ostatok = number % integer;
                if (ostatok > 0) {
                    number = ostatok;
                } else {
                    break;
                }

            }
        }
        System.out.println(st);

    }
}




