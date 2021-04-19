package com.company.PR7.Composite;

import java.util.ArrayList;
import java.util.List;

class Branch implements Employee
{
    private final String name;
    private final List<Employee> employeeList = new ArrayList<Employee>();

    public Branch(String name)
    {
        this.name = name;
    }

    @Override
    public void showEmployeeDetails()
    {
        System.out.println("Branch: " +name+" {");
        for (Employee i:employeeList
             ) {
            i.showEmployeeDetails();
        }
        System.out.println("}");
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}

