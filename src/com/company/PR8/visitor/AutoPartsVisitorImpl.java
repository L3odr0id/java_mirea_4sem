package com.company.PR8.visitor;


class AutoPartsVisitorImpl implements AutoPartsVisitor {
    @Override
    public int visit(Wheel wheel) {
        int cost = wheel.getPrice();
        System.out.println(wheel.getName() + " cost = " + cost);
        return cost;
    }

    @Override
    public int visit(Engine engine) {
        int cost = engine.getPricePerHP() * engine.getHp();
        System.out.println(engine.getName() + " cost = " + cost);
        return cost;
    }
}