package org.example.javadb;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCstatementcreate {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement= null;
        String query="CREATE TABLE employee(employee_id INT(5) NOT NULL,name VARCHAR(20))";
        try{
            connection=JDBCConnect.getConnection();
            //krijojme nje statement
            statement=connection.createStatement();
            statement.execute(query);
            statement.close();
            connection.close();
            System.out.println("Table created successfully");


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
