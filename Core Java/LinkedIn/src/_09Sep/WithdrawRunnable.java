package _09Sep;

public class WithdrawRunnable implements Runnable{
    private BankAccount bankAccount;
    private int amount;

    WithdrawRunnable(BankAccount bankAccount, int amount){
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}
