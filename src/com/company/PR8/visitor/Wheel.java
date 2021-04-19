package com.company.PR8.visitor;

class Wheel implements ItemElement
{
    private int price;
    private String name;

    public Wheel(int cost, String name)
    {
        this.price=cost;
        this.name =name;
    }

    public int getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int accept(AutoPartsVisitor visitor)
    {
        return visitor.visit(this);
    }

}