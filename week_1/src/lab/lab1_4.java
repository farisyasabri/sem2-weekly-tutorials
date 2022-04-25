package lab;

import java.util.ArrayList;
import java.util.Date;

public class lab1_4 {
    public static void main(String[] args) {

        Account1 acc = new Account1(1122,1000,"Farisya");

        acc.setAnnualInterestRate(1.5);

        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);

        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(3);

        System.out.println("Account Summary");
        System.out.println("-----------------------");
        System.out.println("Account holder name: "+ acc.getName());
        System.out.println("Interest rate: " + acc.getAnnualInterestRate());
        System.out.println("Balance: "+ acc.getBalance());
        System.out.println("List of Transaction");
        System.out.println("-------------------------");

        for (int i=0;i<acc.getTransactions().size();i++){
            System.out.println("Date: " + acc.getTransactions().get(i).getDate());
            System.out.println("Type: "+ acc.getTransactions().get(i).getType());
            System.out.println("Amount: "+ acc.getTransactions().get(i).getAmount());
            System.out.println("Balance: " + acc.getTransactions().get(i).getBalance());
            System.out.println("Description: "+ acc.getTransactions().get(i).getDescription());
            System.out.println();
        }
    }
}

class Account1{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    //ArrayList<String> Transaction = new ArrayList<String>();
    private ArrayList<Transaction> transactions;

    public Account1() {
        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    public Account1(int id, double balance) {
        name = "";
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    public Account1(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate(){

        return getAnnualInterestRate() /12;
    }

    public double getMonthlyInterest(){

        return getBalance() * (getMonthlyInterestRate()/100);
    }

    public void withdraw(double amount){
        //setBalance(getBalance()-2500);
        balance -= amount;
        transactions.add(new Transaction('W',amount,balance,"Withdrawal from account"));
    }

    public void deposit(double amount){
        //setBalance(getBalance()+3000);
        balance += amount;
        transactions.add(new Transaction('D',amount,balance,"Deposit from account"));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}

class Transaction{
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {

        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public String getDate() {
        return date.toString();
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}













