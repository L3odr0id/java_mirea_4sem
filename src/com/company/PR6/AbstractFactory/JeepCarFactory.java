package com.company.PR6.AbstractFactory;

class JeepCarFactory {
    static Car buildCar(CarType model) {
        return switch (model) {
            case PETROL -> new PetrolCar(BodyType.JEEP);
            case ELECTRICAL -> new ElectricalCar(BodyType.JEEP);
        };
    }
}
