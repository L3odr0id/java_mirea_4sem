package com.company.PR6.AbstractFactory;

class ElectricalCar extends Car {
    ElectricalCar(BodyType bodyType) {
        super(CarType.ELECTRICAL, bodyType);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Electrical constructor");
    }
}
