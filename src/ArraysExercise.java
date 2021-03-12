import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercise {


    public static Person[] addToArray(Person[] array, Person obj) {
        Person[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length -1] = obj;
        return newArray;
    }


    public static void main(String[] args) {

        Person[] peopleArray = {
            new Person("Jim"),
            new Person("Pam"),
            new Person("Mike")
        };

        for (Person person : peopleArray) {
            System.out.print(person.getName() + " ");
        }


        Person[] newPeopleArray = addToArray( peopleArray, new Person("Dwight"));

        for ( Person person : newPeopleArray) {
            System.out.print(person.getName() + " ");
        }

//        System.out.println(Arrays.toString(peopleArray));
//        System.out.println(Arrays.toString(newPeopleArray));

//        newPeopleArray[newPeopleArray.length -1] = new Person("Dwight");

//        public static array addPerson() {
//            // Creating the new array because you cannot change the
//            // length of the original peopleArray
//            Person newPeopleArray[] = new Person[peopleArray.length + 1];
//            // Inserting the old elements into the new array:
//        }


//        System.out.println(Arrays.toString(peopleArray));

//        peopleArray[0] = Person.setName("John");

//        int[] numbers = {1, 2, 3, 4, 5};

//        for(Person person : people )


    }

}
