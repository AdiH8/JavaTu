package Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        try {
            if (radius > 0) {
                this.radius = radius;
            } else {
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e){
            System.out.println("Radius must be greater than zero!");
        }
    }

    @Override
    double calculateArea() {
        return radius*radius*Math.PI;
    }
}
