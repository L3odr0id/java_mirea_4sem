package com.company.PR6.Prototype;

import com.company.PR6.FactoryMethod.Car;
import com.company.PR6.FactoryMethod.JeepCar;
import com.company.PR6.FactoryMethod.SedanCar;

import java.util.HashMap;
import java.util.Map;

class CarStore {

    private static Map<String, Car> carMap = new HashMap<String, Car>();

    static {
        carMap.put("jeep", new JeepCar());
        carMap.put("sedan", new SedanCar());
    }

    public static Car getCar(String bodyType) {
        return (Car) carMap.get(bodyType);
    }
}
