package org.example.jtodolist;

import java.sql.*;
import java.util.Scanner;

public class ToDoListManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/toDoDb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try(Connection connection= DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD)) {
            createTablesIfNotExist(connection);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Create ToDo List\n2. View ToDo Lists\n3. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        createToDoList(connection);
                        break;
                    case 2:
                       // viewToDoLists(connection);
                        break;
                    case 3:
                        System.out.println("Exiting application...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTablesIfNotExist(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            //create to do list table query
            String todoListQuery = "CREATE TABLE IF NOT EXISTS todolist(id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(255) NOT NULL)";

            statement.executeUpdate(todoListQuery);

            //create task table query
            String taskQuery = "CREATE TABLE IF NOT EXISTS task(" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "todolist_id INT," +
                    "title VARCHAR(255) NOT NULL," +
                    "description TEXT," +
                    "due_date VARCHAR(20)," +
                    "priority VARCHAR(20)," +
                    "completed BOOLEAN," +
                    "FOREIGN KEY (todolist_id) REFERENCES todolist(id)) ";
            statement.executeUpdate(taskQuery);

        }
    }
    private static  void createToDoList(Connection connection)throws SQLException{
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter to do list name:");
        String listName=scanner.nextLine();
        String query="INSERT INTO todolist (name) VALUE(?)";
        try(PreparedStatement preparedStatement=connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1,listName);
            int affectedRows=preparedStatement.executeUpdate();
            if(affectedRows>0){
                System.out.println("To Do List created successfully");
            }else{
                System.out.println("Error");
            }

        }
    }
}
