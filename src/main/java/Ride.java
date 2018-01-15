public abstract class Ride {

    private int price;
    private double minHeight;
    private double maxHeight;
    private int minAge;

    public Ride(int price, double minHeight, double maxHeight, int minAge){
        this.price = price;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.minAge = minAge;
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

    public int getminAge() {
        return this.minAge;
    }

}
