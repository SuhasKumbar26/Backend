import java.sql.*;
import java.util.Scanner;

public class TransactionExample {
    public static final String URL = "jdbc:mysql://localhost:portNumber/databaseName";
    public static final String USERNAME = "userName";
    public static final String PASSWORD = "Password";

    static void main() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            connection.setAutoCommit(false);
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter sender ac-No: ");
            int sender_acNo = scanner.nextInt();

            System.out.print("Enter receiver ac-No: ");
            int receiver_acNo = scanner.nextInt();

            System.out.print("Enter amount: ");
            int amount = scanner.nextInt();

            String debit_Query = "UPDATE accounts SET balance = balance - ? WHERE ac_no = ?";
            String credit_Query = "UPDATE accounts SET balance = balance + ? WHERE ac_no = ?";

            PreparedStatement psDebit = connection.prepareStatement(debit_Query);
            PreparedStatement psCredit = connection.prepareStatement(credit_Query);

            psDebit.setDouble(1, amount);
            psDebit.setInt(2,sender_acNo);

            psCredit.setDouble(1, amount);
            psCredit.setInt(2, receiver_acNo);

            if(checkAmount(connection, sender_acNo, amount)){
                psDebit.executeUpdate();
                psCredit.executeUpdate();
                connection.commit();
            } else{
                connection.rollback();
                System.out.println("Execution failed due to insufficient AMOUNT");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if (connection != null) connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean checkAmount(Connection connection, int senderAcNo, int amount) {
        boolean ans = false;
        String getAmountQuery = String.format("SELECT balance FROM accounts WHERE ac_no = %d", senderAcNo);
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getAmountQuery);
            if (resultSet.next()){
                System.out.println("actual amount: "+resultSet.getDouble("balance"));
                ans = resultSet.getDouble("balance") >= amount;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return ans;
    }
}


