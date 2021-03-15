package shapes;

public class Rectangle {


    // --------------------- Fields -------------------------------------
    protected int length;

    protected int width;

    // --------------------- Constructor-----------------------------------
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    // Without Super: need to set a default constructor
//    public Rectangle() {
//    }

    // -------------------- Methods ----------------------------------------

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (length * 2) + (width * 2);
    }


}
