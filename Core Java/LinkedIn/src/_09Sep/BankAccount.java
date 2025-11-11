package _09Sep;

public class BankAccount {
    private int balance = 5000;

    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposit Successful");
    }

    public synchronized void withdraw(int amount){
        if(balance < amount){
            System.out.println("Low balance");
        } else{
            balance -= amount;
            System.out.println("Withdraw Successful");
        }
    }

    public synchronized int getBalance(){
        return balance;
    }
}
