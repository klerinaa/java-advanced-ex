package org.example.javadb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCGetData {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement= null;
        String query="SELECT employee_id,name FROM employee";
        try{
            connection=JDBCConnect.getConnection();
            //krijojme nje statement
            statement=connection.createStatement();

            ResultSet rs=statement.executeQuery(query);
            while (rs.next()){
                String empId=rs.getString("employee_id");
                String name=rs.getString("name");
                System.out.println("Employee Id :"+empId);
                System.out.println("Name :"+name);
            }



            statement.close();
            connection.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
