package lab;

import java.util.Date;

public class lab1_3 {
    public static void main(String[] args) {
        Account first = new Account(1122,20000);
        first.setAnnualInterestRate(4.5);
        System.out.println(first.getId()+" "+  first.getBalance()+ " " +first.getMonthlyInterest());
        System.out.print("withdraw balance: ");
        first.withdraw();
        System.out.println(first.getBalance());
        System.out.print("deposit balance: ");
        first.deposit();
        System.out.println(first.getBalance());
        System.out.println(first.getDateCreated());
    }
}

class Account{
    private int id = 0;
    private double balance =0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){

        return (getAnnualInterestRate()/100) /12;
    }

    public double getMonthlyInterest(){

        return getBalance() * getMonthlyInterestRate();
    }

    public void withdraw(){
        setBalance(getBalance()-2500);
    }

    public void deposit(){
        setBalance(getBalance()+3000);
    }
}














