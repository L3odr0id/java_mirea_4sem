package com.company.PR7.Composite;


// Driver class
public class CompositeDemo
{
    public static void main (String[] args)
    {
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        Branch branch1 = new Branch("Branch 12");
        branch1.addEmployee(leaf1);
        branch1.addEmployee(leaf2);

        Leaf leaf3 = new Leaf("Leaf 3");
        Leaf leaf4 = new Leaf("Leaf 4");

        Branch branch2 = new Branch("Branch 34");
        branch2.addEmployee(leaf3);
        branch2.addEmployee(leaf4);

        Trunk trunk = new Trunk();
        trunk.addEmployee(branch1);
        trunk.addEmployee(branch2);

        trunk.showEmployeeDetails();
    }
}