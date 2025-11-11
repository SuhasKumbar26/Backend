package _09Sep;

public class DepositRunnable implements Runnable{
    private BankAccount bankAccount;
    private int amount;

    DepositRunnable(BankAccount bankAccount, int amount){
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.deposit(amount);
    }
}
