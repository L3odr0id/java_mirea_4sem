package com.company.PR6.FactoryMethod;


import com.company.PR6.AbstractFactory.BodyType;
import com.company.PR6.AbstractFactory.CarType;

public class SedanCar extends Car {

    public SedanCar() {
        super(BodyType.SEDAN);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}