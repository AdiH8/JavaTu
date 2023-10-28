import People.*;
import Shapes.*;
import Cars.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John", 25);
        person1.PrintDetails();

        Student student1 = new Student("Jane", 30, 5.20);
        student1.PrintDetails();

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println("Area of circle: " + circle.area());
        System.out.println("Perimeter of circle: " + circle.perimeter());

        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());

        Car myCar = new Car("BMW", 60, 500, 10000);

        myCar.accelerate();
        myCar.refuel(200);
        myCar.drive(100,7.8);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Speed: " + myCar.getSpeed());
        System.out.println("Fuel: " + myCar.getFuel());
        System.out.println("Mileage: " + myCar.getMileage());

    }



}