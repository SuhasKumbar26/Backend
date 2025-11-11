import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:portNumber/databaseNAme";
    private static final String userName = "username";
    private static final String password = "password";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, userName, password);
            // Statement
            /*
            // -------------------------------------------------------------------------------------------------------------------
            // Statement statement = connection.createStatement();
            // INSERT data to table
            *//*
            String insertQuery = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %o, %f)", "Rahul", 18, 89.76);
            int row_affected = statement.executeUpdate(insertQuery);

            if (row_affected > 0){
                System.out.println("data INSERT successfully");
            } else{
                System.out.println("NO INSERT on database");
            }
            *//*

            // UPDATE data to table
            *//*
//            String updateQuery = String.format("UPDATE students SET name = '%s' WHERE id = %d", "Kamal",3);
            String updateQuery = String.format("UPDATE students SET age = '%d' WHERE id = %d", 18, 3);
            int row_affected = statement.executeUpdate(updateQuery);
            if (row_affected > 0){
                System.out.println("data UPDATED successfully");
            } else{
                System.out.println("NO Update on database");
            }
            *//*

            // DELETE from table
            */
            /*

            String deleteQuery = "DELETE FROM students WHERE id = 3";
            int row = statement.executeUpdate(deleteQuery);
            if (row > 0){
                System.out.println("data DELETED successfully");
            } else{
                System.out.println("NO DELETE on database");
            }
            */

            // RETRIEVE data from table
            /*
            String selectQuery = "select * from students";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.println("ID: "+id+" NAME: "+name+" AGE: "+age+" MARKS: "+marks);
            }
            // -------------------------------------------------------------------------------------------------------------------
            */

            //BATCH PROCESSING
            Statement statement = connection.createStatement();
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Marks: ");
                double marks = scanner.nextDouble();

                String insertQuery = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %f)",name,age,marks);
                statement.addBatch(insertQuery);

                System.out.print("You want to ADD more data(Y/N): ");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("N")) break;
            }

            int[] arr = statement.executeBatch();

            for (int i = 0; i < arr.length; i++) {
                if(i == 0) System.out.println("not INSERTED");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
