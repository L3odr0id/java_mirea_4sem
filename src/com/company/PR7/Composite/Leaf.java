package com.company.PR7.Composite;

class Leaf implements Employee
{
    private final String name;

    public Leaf(String name)
    {
        this.name = name;
    }

    @Override
    public void showEmployeeDetails()
    {
        System.out.println("Leaf: " +name);
    }
}