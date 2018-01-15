public class GhostTrain extends Ride{

    public GhostTrain(int price, double minHeight, double maxHeight, int age) {
        super(price, minHeight, maxHeight, age);
    }

    public String rideGoal(String goal){
        return "This ride will " + goal;
    }
}
