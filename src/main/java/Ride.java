public abstract class Ride {

    private int price;
    private double minHeight;
    private double maxHeight;

    public Ride(int price, double minHeight, double maxHeight){
        this.price = price;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public int getridePrice() {
        return this.price;
    }

    public double getminHeight() {
        return this.minHeight;
    }

    public double getmaxHeight() {
        return this.minHeight;
    }

}
