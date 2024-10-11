package day2;

public class Car {
    private String make;
    private String model;
    private Date purchasedate;

    public Car(String make, String model, Date purchasedate)
    {
        this.make = make;
        this.model = model;
        this.purchasedate = purchasedate;
    }
    public String toString()
    {
        return "Car make: " + this.make + "  Model: " + this.model + "  Purchase Date: " + this.purchasedate;
    }

    public static void main(String[] args) {
        Car car = new Car("Honda", "City", new Date(1,"Mar", 2022 ));
        System.out.println(car);
    }
}
