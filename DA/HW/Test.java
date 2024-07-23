// Yuanbo Pang CIS 35A
// This is an automatic record of deposits and withdrawals of class
import java.util.Date;
public class Test {

    public static void main (String[] args) {

        Account account = new Account(1122, 20000);

        Account.setAnnualInterestRate(4.5);



        account.withdraw(2500);

        account.deposit(3000);

        System.out.println("Balance is " + account.getBalance());

        System.out.println("Monthly interest is " +

                account.getMonthlyInterest());

        System.out.println("This account was created at " +

                account.getDateCreated());

    }

}



class Account {
    private int id;
    private double balance=0;
    private static double annualInterestRate=0;
    private Date dateCreated;

    public Account(){
        this.dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount){
        balance += amount;
    }

    // Method to get the monthly interest
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }


}

/*
Output:
Balance is 20500.0
Monthly interest is 76.875
This account was created at Mon Jul 22 00:00:00 GMT 2024
*/