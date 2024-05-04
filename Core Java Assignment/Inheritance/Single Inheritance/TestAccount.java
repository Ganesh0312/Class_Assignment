/* 8)Write a Java Program for Single Inheritance of Account. Take a method called void
Deposit() and void CalculateInterst().
*/

class Account {
    protected double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " processed. New balance: $" + balance);
    }
}
class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(double initialBalance, double rate) {
        super(initialBalance);
        interestRate = rate;
    }
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest calculating for account with Curent balance: $" + balance);
        balance += interest;
        System.out.println("Interest calculated and added. New balance: $" + balance);
    }
}

public class TestAccount {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(1000, 5); 
        s.deposit(500);
        s.calculateInterest();
    }
}
