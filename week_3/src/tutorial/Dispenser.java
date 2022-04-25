package tutorial;

public interface Dispenser <T> {
    double costOfAnItem = 0;
    int noOfItem = 0;

    /**
     * get cost for an item
     * @param item the type of item to get the cost
     * @return double for cost of an item
     */
    public double getCost(T item);

    /**
     *to set the cost for the particular item
     * @param item the type of item to set the cost
     */
    public void setCost(T item);

    /**
     * the get the balance no of item remain after the
     * dispenser release the chosen item
     * @param noOfItem for the no of item the dispenser release
     * @return int for the balance of the item remain after release
     */
    public int Release(int noOfItem);

    /**
     * set the no of the particular item in the dispenser
     * @param noOfItem for the number of the particular item in the dispenser
     */
    public void setNoOfItem(int noOfItem);

    /**
     * get the number of particular item in the dispenser
     * @param item for the type of item to get the total
     * @return int for the number of the particular item
     */
    public int getNoOfItem(T item);
}
