package _09Sep;

public class BankRunnableExample {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        DepositRunnable depositRunnable = new DepositRunnable(account,2000);
        WithdrawRunnable withdrawRunnable = new WithdrawRunnable(account,3000);

        Thread depositThread = new Thread(depositRunnable);
        Thread withdrawThread = new Thread(withdrawRunnable);

        depositThread.start();
        withdrawThread.start();

        try{
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e){
            System.out.println("Error occurred");
        }

        System.out.println("Available balance is: "+account.getBalance());
    }
}
