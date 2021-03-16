package shapes;

public class Rectangle extends Quadrilateral{

    // ------------------------------------------------------ Constructor:
    public Rectangle(double length, double width) {
        super(length, width);
    }

    // ------------------------------------------------------ Setters: (Override)
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    // ------------------------------------------------------ Getters: (Override)
    @Override
    public double getPerimeter() {
        return (super.length * 2) + (super.width * 2);
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }


    //
//    // --------------------- Fields -------------------------------------
//    protected int length;
//
//    protected int width;
//
//    // --------------------- Constructor-----------------------------------
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
//    // Without Super: need to set a default constructor
////    public Rectangle() {
////    }
//
//    // -------------------- Methods ----------------------------------------
//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return (length * 2) + (width * 2);
//    }


}
