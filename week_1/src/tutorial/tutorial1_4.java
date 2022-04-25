package tutorial;

public class tutorial1_4 {
    public static void main(String[] args) {

    }
}

abstract class Vehicle{
    private double maxSpeed;
    protected double currentSpeed;
    private int Vehicle;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void accelerate();

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void pedalToMetal(){
        accelerate();
    }

}

