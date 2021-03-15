package IneritanceAndPolymorphismMiniExercises;

public class Ingredient {

    int volumeInOunces;

    int servingSize;

    boolean organic;

    boolean onHand;

    protected int calories = 100;

    public void servingsPerUnit() {
        System.out.println("calculating the number of servings per unit with the volumeInOunces and servingSize");
    }

    public void priceCompare() {
        System.out.println("Under or Over average cost");
    }

    public void throwAway() {
        onHand = false;
        System.out.println("Throwing away ingredient...");
    }

    public void getMore() {
        onHand = true;
        System.out.println("Getting more...");
    }

}
