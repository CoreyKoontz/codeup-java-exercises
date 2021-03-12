import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercise {


    public static Person[] addPerson(Person[] array, Person obj) {
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

        // Printing the elements of the original return
        for (Person person : peopleArray) {
            System.out.print(person.getName() + " ");
        }

        // Creating the new array because you cannot change the
        // length of the original peopleArray

        // Adding new element to new array
        Person[] newPeopleArray = addPerson( peopleArray, new Person("Dwight"));

        // Printing the new array with the new element
        for ( Person person : newPeopleArray) {
            System.out.print(person.getName() + " ");
        }

        System.out.println(Arrays.toString(peopleArray));

        int[] numbers = {1, 2, 3, 4, 5};


    }

}
