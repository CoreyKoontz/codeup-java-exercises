package IneritanceAndPolymorphismMiniExercises;

public class Ingredient {

    int volumeInOunces;

    int servingSize;

    boolean organic;

    public void servingsPerUnit() {
        System.out.println("calculating the number of servings per unit with the volumeInOunces and servingSize");
    }

    public void priceCompare() {
        System.out.println("Under or Over average cost");
    }

}
