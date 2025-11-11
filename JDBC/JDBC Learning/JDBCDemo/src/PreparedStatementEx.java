import java.sql.*;
import java.util.Scanner;

public class PreparedStatementEx {
    public static final String URL = "jdbc:mysql://localhost:portNumber/databaseName";
    public static final String USERNAME = "userName";
    public static final String PASSWORD = "Password";
    public static void main() {
        // 1. load drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        // 2.make connection using Driver
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            // prepare query
            // INSERT (create)
            /*
            String insertQuery = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
            PreparedStatement psInsert = connection.prepareStatement(insertQuery);
            psInsert.setString(1,"Manna");
            psInsert.setInt(2,25);
            psInsert.setDouble(3,88.88);

            int row = psInsert.executeUpdate();
            if (row > 0){
                System.out.println("INSERTED successfully");
            } else{
                System.out.println("NOT INSERTED");
            }
            */

            // RETRIEVE (read)
            /*
            String retrieveQuery = "SELECT * FROM students WHERE id = ?";
            PreparedStatement psRetrieve = connection.prepareStatement(retrieveQuery);
            psRetrieve.setInt(1,1);

            ResultSet resultSet = psRetrieve.executeQuery();

            while (resultSet.next()){
                System.out.println("ID: "+resultSet.getInt("id"));
                System.out.println("NAME: "+resultSet.getString("name"));
                System.out.println("AGE: "+resultSet.getInt("age"));
                System.out.println("MARKS: "+resultSet.getDouble("marks"));
            }*/

            // UPDATE (update)
            /*
            String updateQuery = "UPDATE students SET marks = ? WHERE id = ? ";
            PreparedStatement psUpdate = connection.prepareStatement(updateQuery);
            psUpdate.setDouble(1,99.99);
            psUpdate.setInt(2,1);

            int row_affected = psUpdate.executeUpdate();

            if (row_affected > 0){
                System.out.println("UPDATED successfully");
            } else{
                System.out.println("NOT UPDATED");
            }
            */


            // DELETE (delete)
            /*
            String deleteQuery = "DELETE FROM students WHERE id = ? ";
            PreparedStatement psDelete = connection.prepareStatement(deleteQuery);
            psDelete.setInt(2,1);

            int row_affected = psDelete.executeUpdate();

            if (row_affected > 0){
                System.out.println("UPDATED successfully");
            } else{
                System.out.println("NOT UPDATED");
            }
            */

            //BATCH PROCESSING
            String InsertQuery = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
            PreparedStatement psInsert = connection.prepareStatement(InsertQuery);
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Marks: ");
                double marks = scanner.nextDouble();

                psInsert.setString(1,name);
                psInsert.setInt(2,age);
                psInsert.setDouble(3,marks);

                psInsert.addBatch();

                System.out.print("You want to ADD more data(Y/N): ");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("N")) break;
            }

            psInsert.executeBatch();

        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
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
