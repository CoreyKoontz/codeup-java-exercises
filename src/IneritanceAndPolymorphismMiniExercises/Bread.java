package IneritanceAndPolymorphismMiniExercises;

public class Bread extends Ingredient{

    boolean isToasted;

    boolean crustOn;

    static void removeCrust (){
        System.out.println("Use knife to remove crust");
        // set crustOn to false
    }

    static void toastBread () {
        System.out.println("Bread has been toasted");
        // Set isToasted to true
    }

    public void throwAway() {
        System.out.println("Throwing away bread");
    }

}
