package IneritanceAndPolymorphismMiniExercises;

public class Knife extends KitchenTool{

    boolean isSharp;

    String typeOfKnife;

    public void cut() {
        System.out.println("cutting");
    }

    public void sharpenKnife() {
        System.out.println("Sharpening knife");
    }


}
