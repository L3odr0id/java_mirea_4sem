package com.company.PR7.Flyweight;

import com.company.PR6.FactoryMethod.Car;

import java.util.Random;


// Driver class
public class FlyweightDemo
{
    static String[] carTypes = {"Sedan", "Jeep"};
    public static void main(String args[])
    {
        for (int i = 0; i < 4; i++)
        {
            Car p = CarFactory.getCar(getRandCarType());
        }
    }

    public static String getRandCarType()
    {
        Random r = new Random();
        int randInt = r.nextInt(carTypes.length);
        return carTypes[randInt];
    }
}