package org.example.javadb;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCGet {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement= null;
        String query="INSERT INTO employee(employee_id,name) values(1,'Klerina'),(2,'emer2'),(3,'test3')";
        try{
            connection=JDBCConnect.getConnection();
            //krijojme nje statement
            statement=connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
            System.out.println("Record created successfully");


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
