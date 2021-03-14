package IneritanceAndPolymorphismMiniExercises;

public class Plate extends KitchenTool{

    String shape;

    String madeOf;

    public void breakPlate() {
        System.out.println("the plate was broken");
    }

    public void putFoodOnPlate() {
        System.out.println("The plate is now holding food");
    }

}
