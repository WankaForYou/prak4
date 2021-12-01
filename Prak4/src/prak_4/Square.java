package prak_4;

public class Square extends Rectangle {
    protected double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);

        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
       this.side = side;
       this.setWidth(side);
       this.setLength(side);
    }

    public void setWidth(double side)
    {
        this.side = side;
        this.setWidth(side);
    }

    public void setLength(double side)
    {
        this.side = side;
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + side + " color = " + color + " " + this.isFilled_str() + " area is " + this.getArea() +
                " Perimeter is " + this.getPerimeter() +
                '}';
    }
}
