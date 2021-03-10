public class dishTest {

    public static void main(String[] args) {

        Dish d1 = new Dish();
        d1.nameOfDish = "Pizza";
        d1.costInCents = 1000;
        d1.wouldRecommend = true;

        d1.printSummary();

        DishTools.shout(d1);

        DishTools.analyzeDishCost(d1);

        DishTools.flipRecommendation(d1);

    }


}

// TODO:
//  - Create another class called DishTest
//  - Add a main method and inside the method...
//    1) instantiate a Dish object and assign to a variable called dish1
//    2) assign creative values for each of the properties
//    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed