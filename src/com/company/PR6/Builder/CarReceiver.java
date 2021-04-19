package com.company.PR6.Builder;

import com.company.PR6.AbstractFactory.BodyType;
import com.company.PR6.AbstractFactory.CarType;

// Client Side Code
class CarReceiver {

    private volatile Car car;

    public CarReceiver() {

        car = Car.Builder.newInstance()
                .setCarType(CarType.PETROL)
                .setBodyType(BodyType.SEDAN)
                .build();
    }

    public Car getCar() {
        return car;
    }
}
