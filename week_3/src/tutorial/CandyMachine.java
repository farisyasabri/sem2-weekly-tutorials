package tutorial;

public interface CandyMachine {
    Dispenser Candy = null;
    Dispenser Cookies = null;
    Dispenser Chip = null;
    Dispenser Gum = null;
    CashRegister cr = null;

    /**
     *
     * @return
     */
    public int makeSelection();

    public String showSelection();
}
