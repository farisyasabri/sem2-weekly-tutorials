package tutorial;

public interface CashRegister {
    double cashOnHand=0;

    /**
     * accept payment from the customer
     * @param cash for the total cost of the chosen product
     * @return true if the cash receive is equal to the total cost chosen product
     */
    public boolean AcceptPayment(double cash);

    /**
     * return the balance if the customer pay more than needed
     * @param cashOnHand for existing cash in the dispenser
     * @param cash for cash receive from the customer
     * @return double for the balance cash to the customer
     */
    public double ReturnCash(double cashOnHand, double cash);

    /**
     * gets the total existing cash in the dispenser
     * @return double for the total existing cash
     */
    public double getCashOnHand();

    /**
     * sets the new total cash in the dispenser after payment
     * @param cash the total price of the product chosen
     */
    public void setCashOnHand(double cash);
}
