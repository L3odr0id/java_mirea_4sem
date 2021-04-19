package com.company.PR7.Flyweight;

import com.company.PR6.FactoryMethod.Car;
import com.company.PR6.FactoryMethod.JeepCar;
import com.company.PR6.FactoryMethod.SedanCar;

import java.util.HashMap;


class CarFactory {
    /* HashMap stores the reference to the object
       of Terrorist(TS) or CounterTerrorist(CT).  */
    private static HashMap<String, Car> hm =
            new HashMap<String, Car>();

    // Method to get a player
    public static Car getCar(String type) {
        Car p = null;


        if (hm.containsKey(type))
            p = hm.get(type);
        else {

            switch (type) {
                case "Sedan" -> {
                    System.out.println("Sedan car Created");
                    p = new SedanCar();
                }
                case "Jeep" -> {
                    System.out.println("Jeep car Created");
                    p = new JeepCar();
                }
            }

            hm.put(type, p);
        }
        return p;
    }
}