package jelly;

import IneritanceAndPolymorphismMiniExercises.Ingredient; // This showed up when I added jelly to a package

public class Jelly extends Ingredient {

    String flavor;

    String type;

    public void jamOrJelly() {
        System.out.println("Returns if it is jam or jelly");
    }

    public void spreadJelly() {
        System.out.println("Spreading jelly");
    }

    public void throwAway() {
        System.out.println("Throwing away jelly");
    }
    
    public void printCals() {
        System.out.println(calories);
    }


}
