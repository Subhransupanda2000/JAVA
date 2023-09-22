package FactoryDesignPattern;

import FactoryDesignPattern.Employee;

public class AndroidDeveloper implements Employee {
    public int salary()
    {
        System.out.println("getting android development salary");
        return 40000;
    }

}
