package IneritanceAndPolymorphismMiniExercises;

public class Knife extends KitchenTool{

    // ----------- Fields ---------------------------------------
    String name;

    boolean isSharp;

    String typeOfKnife;

    // ----------- Methods ---------------------------------------

    // Constructor:
    public Knife(String name) {
        super(name);
        isSharp = true;
    }

    public void cut() {
        isSharp = false;
        System.out.println("cutting");
    }

    public void sharpenKnife() {
        isSharp = true;
        System.out.println("Sharpening knife");
    }

    public void washTools() {
        System.out.println("Knife has been washed");
    }


}
