package org.example.javadb;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCDelete {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement= null;
        String query="DELETE FROM employee WHERE employee_id=3";
        try{
            connection=JDBCConnect.getConnection();
            //krijojme nje statement
            statement=connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
            System.out.println("Record deleted successfully");


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
