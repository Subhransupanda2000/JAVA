package FactoryDesignPattern;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee= EmployeeFactory.getEmployee(("ANDROID DEVELOPER"));
        int salary=employee.salary();
        System.out.println(salary);
        Employee employee2= EmployeeFactory.getEmployee(("WEB DEVELOPER"));
        System.out.println("salary"+employee2.salary());



    }
}
