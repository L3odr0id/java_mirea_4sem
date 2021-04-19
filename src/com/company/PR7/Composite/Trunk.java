package com.company.PR7.Composite;

import java.util.ArrayList;
import java.util.List;

class Trunk implements Employee
{
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails()
    {
        System.out.println("Trunk: [");
        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
        System.out.println("]");
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