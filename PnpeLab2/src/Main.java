import People.*;
import Shapes.*;
import Cars.*;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", 120, 100, 25000);
        cars[1] = new ElectricCar("Tesla", 200, 10000, 100, 120);
        cars[2] = new Car("Honda", 150, 80, 120000);

        for (Car car : cars) {
            if (car instanceof ElectricCar) {
                ((ElectricCar) car).driveElectric(50);
                System.out.println(car.getMileage());
            } else {
                car.drive(50,7.8);
                System.out.println(car.getMileage());
            }
        }
    }




}