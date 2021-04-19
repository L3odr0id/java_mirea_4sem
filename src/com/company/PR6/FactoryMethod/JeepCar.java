package com.company.PR6.FactoryMethod;

import com.company.PR6.AbstractFactory.BodyType;

public class JeepCar extends Car {

    public JeepCar() {
        super(BodyType.JEEP);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}