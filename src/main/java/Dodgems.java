public class Dodgems extends Ride{

    public Dodgems(int price, double minHeight, double maxHeight, int age) {
        super(price, minHeight, maxHeight, age);
    }

    public String rideGoal(String goal){
        return "This ride will " + goal;
    }
}
