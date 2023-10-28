package Cars;

public class Car {
    private String brand;
    private int speed;
    private double fuel;
    private int mileage;

    public Car(String brand, int speed, double fuel, int mileage) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
    }

    public void accelerate() {
        speed += 10;
    }

    public void refuel(double amount) {
        fuel += amount;
    }
    public void drive(int distance, double efficiency) {
        mileage += distance;
        fuel -= efficiency * ((double)distance/100);
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }
}
