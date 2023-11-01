package com.jdbcjava;
import java.sql.*;

public class Jdbcdemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs=null;

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2", "root", "system");
        stmt = con.createStatement();
       //String q= "create table EMPLOYEE(ID INT (10), NAME VARCHAR(30),ADDRESS VARCHAR(30), PIN INT (10))" ;
        /*String q = "SELECT * FROM EMPLOYEE";
        ResultSet rs = stmt.executeQuery(q);
        rs.next();
        System.out.println(rs.getString(3));
        System.out.println(rs.getInt(4));*/
        String q="insert into student values(2025,\"ram\",\"bbsr\",761030)";
        int res=stmt.executeUpdate(q);
        System.out.println(res);

        q="SELECT * FROM student";
        rs= stmt.executeQuery(q);
        while(rs.next())
        {
            System.out.println(rs.getInt("id"));
        }

    }
}