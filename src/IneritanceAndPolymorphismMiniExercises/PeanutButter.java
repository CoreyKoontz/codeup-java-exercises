package IneritanceAndPolymorphismMiniExercises;

public class PeanutButter extends Ingredient{

    boolean isCrunchy;

    boolean isLowFat;

    public void useAServing() {
        System.out.println("");
    }

    public void throwAway() {
        onHand = false;
        System.out.println("Throwing away peanut butter");

    }



}
