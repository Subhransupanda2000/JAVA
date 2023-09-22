package FactoryDesignPattern;

import FactoryDesignPattern.Employee;

public class WebDeveloper implements Employee {
    public int salary()
    {
        System.out.println("Webdeveloper salary");
        return 50000;
    }

}
