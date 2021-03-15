package IneritanceAndPolymorphismMiniExercises;

public class Plate extends KitchenTool{

    // --------------- Fields --------------------------------
    String shape;

    String madeOf;

    // -------------- Methods ----------------------------------
    // Constructor:
    public Plate(String name) {
        super(name);
    }

    public void breakPlate() {
        System.out.println("the plate was broken");
    }

    public void putFoodOnPlate() {
        System.out.println("The plate is now holding food");
    }

    public void washTools() {
        System.out.println("Plate has been washed");
    }

}
