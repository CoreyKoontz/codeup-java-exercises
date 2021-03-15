package IneritanceAndPolymorphismMiniExercises;

import jelly.Jelly;

public class KitchenMain {

    public static void main(String[] args) {

//        var a = new Ingredient();
//        System.out.println(a.calories);


        var c = new Knife("knife1");
        System.out.println(c.getName());
        System.out.println(c.clean);
        System.out.println(c.washable);
        System.out.println(c.onHand);
        System.out.println("Is knife on hand: " + c.onHand);
        c.getTools();
        System.out.println("Is knife on hand: " + c.onHand);
//        System.out.println("Is knife sharp: " + c.isSharp);
//        c.sharpenKnife();
//        System.out.println("Is knife sharp: " + c.isSharp);
//        c.cut();
//        System.out.println("Is knife sharp: " + c.isSharp);
//        c.washTools();

//        var pb = new PeanutButter();
//        System.out.println("Do we have Peanut Butter: " + pb.onHand);
//        pb.getMore();
//        System.out.println("Do we have Peanut Butter: " + pb.onHand);
//        pb.throwAway();
//        System.out.println("Do we have Peanut Butter: " + pb.onHand);


//        var jelly = new Jelly();
//        jelly.throwAway();
//        jelly.calories = 123;
//        System.out.println(jelly.calories);
//        jelly.printCals();
    }

}
