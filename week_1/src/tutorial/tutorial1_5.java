package tutorial;

public class tutorial1_5 {
    public static void main(String[] args) {

    }
}

class BankAccount implements Account{
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int deposit(int a){
        int newBalance = a + balance;
        return newBalance;
    }

    public boolean withdraw(int b){
        int newBalance;
        if (b<=balance){
            newBalance = balance - b;
            return true;
        }
        else
            return false;
    }
}