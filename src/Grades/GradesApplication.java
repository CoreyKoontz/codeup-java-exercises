package Grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        // -------------------------------------------------- Create a HashMap named students:
        HashMap<String, Student> students = new HashMap<>();

        // -------------------------------------------------- Creating Student Objects:
        var student1 = new Student("Jim");
        student1.addGrade(89);
        student1.addGrade(76);
        student1.addGrade(98);

        var student2 = new Student("Pam");
        student1.addGrade(99);
        student1.addGrade(84);
        student1.addGrade(92);

        var student3 = new Student("Dwight");
        student1.addGrade(85);
        student1.addGrade(76);
        student1.addGrade(93);

        var student4 = new Student("Toby");
        student1.addGrade(78);
        student1.addGrade(76);
        student1.addGrade(67);

        // -------------------------------------------------- Adding student objects to the Map:
        students.put("JimGitHub", student1);
        students.put("PamGitHub", student2);
        students.put("DwightGitHub", student3);
        students.put("TobyGitHub", student4);

        // -------------------------------------------------- Display Git usernames to user:
        usernameConsoleDisplay(students);

        // -------------------------------------------------- User picks username and we save the value:
        System.out.println(students.get(userPickStudent()));

    }

    // ------------------------------------------------------ Console display method:
    public static void usernameConsoleDisplay(HashMap<String, Student> students) {
        for (String key : students.keySet()){
            System.out.println("-----------------");
            System.out.println(key);
        }
        System.out.println("-----------------");
    }

    // ------------------------------------------------------ Method for getting user choice value:
    public static String userPickStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which student would you like to see more information about? \nEnter a username:");
        String userChoice = sc.nextLine();
        return userChoice;
    }

//    public static void displayStudent() {
//       String key = userPickStudent();
//       return students.get(key).grades;
//
//    }
}
