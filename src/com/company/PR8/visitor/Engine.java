package com.company.PR8.visitor;

class Engine implements ItemElement {
    private int pricePerHP;
    private int hp;
    private String name;

    public Engine(int pricePerHP, int hp, String nm) {
        this.pricePerHP = pricePerHP;
        this.hp = hp;
        this.name = nm;
    }

    public int getPricePerHP() {
        return pricePerHP;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int accept(AutoPartsVisitor visitor) {
        return visitor.visit(this);
    }

}