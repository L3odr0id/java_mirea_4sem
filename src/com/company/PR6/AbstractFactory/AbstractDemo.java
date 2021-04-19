package com.company.PR6.AbstractFactory;

public class AbstractDemo {
    public static void main(String[] args) {
        System.out.println("Abstract Demo");
        System.out.println(CarFactory.buildCar(CarType.PETROL));
        System.out.println(CarFactory.buildCar(CarType.ELECTRICAL));
    }
}
