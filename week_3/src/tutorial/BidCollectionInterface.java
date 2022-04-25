package tutorial;

public interface BidCollectionInterface<T> {

    /*
    adds bid
    @param amount the value of bids to add
    @return void
     */
    public void addBid(double amount);

    /*
    gets the best yearly cost for the bids in the collection
    @param collection the object of the collection for the bid
    @return double the best yearly cost in that collection
     */
    public double bestYearlyCostBid(T collection);

    /*
    gets the best initial cost for the bids in the collection
    initial cost = unit cost + installation cost
    @param collection the object for the initial cost in that bids
    @return double for the value of initial cost
     */
    public double costInitial(T collection);

    /*
    clears all the items from the collection
     */
    public void clear();

    /*
    gets the number of items in the collection
    @param collection the object to of the the item to get
    @return int for the number of items in the collection
     */
    public int numOfItem(T collection);

    /*
    sees whether this collection is empty
    @return true if the collection is empty
     */
    public boolean isEmpty();

}












