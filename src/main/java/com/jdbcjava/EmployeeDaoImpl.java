package com.jdbcjava;

import java.sql.*;

class Employee {
    private int id;
    private String name;
    private String deptName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

public class EmployeeDaoImpl {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydb1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "system";

    public static int insert(Employee e) throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement("INSERT INTO employees (name, deptName) VALUES (?, ?)",
                     Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, e.getName());
            statement.setString(2, e.getDeptName());
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    e.setId(generatedKeys.getInt(1));
                }
            }
            return rowsAffected;
        }
    }

    public int update(int id, Employee e) throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement("UPDATE employees SET name=?, deptName=? WHERE id=?")) {
            statement.setString(1, e.getName());
            statement.setString(2, e.getDeptName());
            statement.setInt(3, id);
            return statement.executeUpdate();
        }
    }

    public int delete(int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement("DELETE FROM employees WHERE id=?")) {
            statement.setInt(1, id);
            return statement.executeUpdate();
        }
    }

    public Employee select(int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employees WHERE id=?")) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setDeptName(resultSet.getString("deptName"));
                return employee;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

        // Insert operation
        Employee newEmployee = new Employee();
        newEmployee.setName("John Doe");
        newEmployee.setDeptName("IT");

        try {
            int insertResult = employeeDao.insert(newEmployee);
            if (insertResult > 0) {
                System.out.println("Employee inserted successfully with ID: " + newEmployee.getId());
            } else {
                System.out.println("Failed to insert employee.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Update operation
        int employeeIdToUpdate = newEmployee.getId();
        Employee updatedEmployee = new Employee();
        updatedEmployee.setName("John Smith");
        updatedEmployee.setDeptName("Development");

        try {
            int updateResult = employeeDao.update(employeeIdToUpdate, updatedEmployee);
            if (updateResult > 0) {
                System.out.println("Employee updated successfully.");
            } else {
                System.out.println("Failed to update employee.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Delete operation
        try {
            int deleteResult = employeeDao.delete(employeeIdToUpdate);
            if (deleteResult > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found or failed to delete.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Select operation
        int employeeIdToSelect = 1; // Provide a valid employee ID to select
        try {
            Employee selectedEmployee = employeeDao.select(employeeIdToSelect);
            if (selectedEmployee != null) {
                System.out.println("Selected Employee:");
                System.out.println("ID: " + selectedEmployee.getId());
                System.out.println("Name: " + selectedEmployee.getName());
                System.out.println("Department: " + selectedEmployee.getDeptName());
            } else {
                System.out.println("Employee not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
