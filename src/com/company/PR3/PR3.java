package com.company.PR3;

import java.util.Map;

public class PR3 {
    private static final Map<Integer, String> mapSync = new MapSync<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 11; i++) {
                addToMap(i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 11; i < 21; i++) {
                addToMap(i);
            }
        });

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sync map:");
        mapSync.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    private static void addToMap(int i) {
        mapSync.put(i, "element_" + i);
    }
}
