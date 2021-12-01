package prak_4;

public class Circle extends Shape{
    protected double radius;

    public Circle(){}
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius + " color = " + color + " " + this.isFilled_str() + " area is " + this.getArea() +
                " Perimeter is " + this.getPerimeter() +
                '}';
    }
}
