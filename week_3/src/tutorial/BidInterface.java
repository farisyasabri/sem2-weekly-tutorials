package tutorial;

public interface BidInterface {

    /**
    @return the String name of company making the bid
     */
    public String companyName();

    /**
    gets the description of the air conditioner
    @return String description of the air conditioner
     */
    public String description();

    /**
    gets the capacity of this air conditioner
    @return double for the capacity of the air conditioner
     */
    public double AcCapacity();

    /**
    gets the seasonal efficiency of the air conditioner
    @param capacity the value in BTU to calculate seasonal efficiency
    @param energy the value in watt-hours to calculate the seasonal efficiency
    @return double for the seasonal efficiency and SEER
     */
    public double seasonalEfficiency(double capacity,double energy);

    /**
    gets the cost of the bid
    @return double for the cost of the bid
     */
    public double costBid();

    /**
    gets the cost of installing the air conditioner
    @param numOfUnit the value of quantity of the air conditioner to be installed
    @return double for cost of installing air conditioner
     */
    public double costInstalling(int numOfUnit);

    /**
    gets the yearly cost of the operating the air conditioner
    @param numOfUnit the value of quantity of the air conditioner to be serviced
    @return double for cost operating of air conditioner yearly
     */
    public double costOperating(int numOfUnit);


}
