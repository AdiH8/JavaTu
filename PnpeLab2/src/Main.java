import People.*;
import Shapes.*;


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
    }



}