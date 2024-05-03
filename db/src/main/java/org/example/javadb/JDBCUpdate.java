package org.example.javadb;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCUpdate {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement= null;
        String query="UPDATE employee SET name='Roi' WHERE employee_id=2";
        try{
            connection=JDBCConnect.getConnection();
            //krijojme nje statement
            statement=connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
            System.out.println("Record updated successfully");


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
