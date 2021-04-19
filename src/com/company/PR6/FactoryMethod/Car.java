package com.company.PR6.FactoryMethod;

import com.company.PR6.AbstractFactory.BodyType;
import com.company.PR6.AbstractFactory.CarType;

public class Car {
    BodyType bodyType;
    Car(BodyType bodyType){
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType=" + bodyType +
                '}';
    }
}
