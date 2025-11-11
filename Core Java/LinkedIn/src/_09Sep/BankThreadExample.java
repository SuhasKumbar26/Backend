package _09Sep;

public class BankThreadExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositThread = new Thread( () -> {
            account.deposit(2000);
        });

        Thread withdrawThread = new Thread( () -> {
            account.withdraw(5000);
        });

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        }catch (InterruptedException exception){
            System.out.println("Error");
        }

        System.out.println("Available balance is: "+account.getBalance());
    }
}
