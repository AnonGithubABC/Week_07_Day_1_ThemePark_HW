public class Customer {

    private int money;
    private double height;
    private int age;


    public Customer(int money, double height, int age){
        this.money = money;
        this.height = height;
        this.age = age;
    }


    public int getMoney() {
        return this.money;
    }

    public String canRideRollerCoaster() {
        if (this.money >= 20);
        return "Yes, they can ride";
    }
}