package org.example.javadb;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnect {
    private static final String DB_URL="jdbc:mysql://localhost:3306/test_db";
    private static final String DB_USERNAME="root";
    private static final String DB_PASSWORD="root";
    public static Connection getConnection(){
        //krijojme nje objekt te Connection dhe do i japim vleren null
        Connection conn= null;
        try{
            //happim connection
            conn= DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            if(conn !=null){
                System.out.println("Successfully connected");
            }else{
                System.out.println("Failed to connect");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
