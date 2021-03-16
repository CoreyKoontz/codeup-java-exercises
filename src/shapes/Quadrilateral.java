package shapes;

public abstract class Quadrilateral implements Shape{

    // ------------------------------------------------------ Fields:
    protected double length;

    protected double width;

    // ------------------------------------------------------ Constructor:
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // ------------------------------------------------------ Abstract Methods:
    public abstract void setLength(double length);

    public abstract void setWidth(double width);

//    public


}
