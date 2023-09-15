package ru.geekbrains.api;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, String> bookPhone = new HashMap<>();
        Scanner scannser = new Scanner(System.in);
        System.out.println("Введите нужную команду: ");
        String userString = scannser.nextLine().toUpperCase();
        String[] parts = userString.split(" ");
        if (parts[0].equals("ADD") && (parts.length == 3)) {
            ADD(bookPhone, parts);
            System.out.print(bookPhone);
        } else if (parts[0].equals("GET") && (parts.length == 2)) {
            GET(bookPhone, parts);
        } else if (parts[0].equals("LIST") && (parts.length == 1)) {
            LIST(bookPhone);
        } else if (parts[0].equals("EXIT") && (parts.length == 1)) {
            EXIT();
        } else if (parts[0].equals("REMOVE") && (parts.length == 2)) {
            REMOVE(bookPhone, parts);
        } else if (parts[0].length() < 3) {
            System.out.println("введена неверная комада");
        }
    }

    public static void ADD(HashMap<String, String> testBook, String[] parts) {
        for (String key :
                testBook.keySet()) {
            if (key.equals(parts[1])) {
                testBook.put(key, testBook.get(key) + "," + parts[2]);
            } else {
                testBook.put(parts[1], parts[2]);

            }
        }
    }

    public static void GET(HashMap<String, String> testBook, String[] parts) {
        boolean isKeyExists = testBook.containsKey(parts[1]);
        if (isKeyExists == true) {
            for (String key :
                    testBook.keySet()) {
                if (key.equals(parts[1])) {
                    System.out.println(testBook.get(key));
                }

            }

        }
        else {
            System.out.println("такая запись не найдена");
        }
    }


    public static void LIST(HashMap<String, String> testBook) {
        for (var i : testBook.entrySet()) {
            System.out.printf(" %s = [%s] \n", i.getKey(), i.getValue());
        }
    }
    public static void REMOVE (HashMap<String, String> testBook, String[] parts) {
        boolean isKeyExists = testBook.containsKey(parts[1]);
        if (isKeyExists == true) {
            for (String key :
                    testBook.keySet()) {
                if (key.equals(parts[1])) {
                    testBook.remove(key);
                    break;
                }
            }
        }
        else {
            System.out.println("такого человека нет");
        }
            }


public static void EXIT(){
    System.exit(0);
    }

}













