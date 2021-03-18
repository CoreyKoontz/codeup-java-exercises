package Grades;

import java.util.*;

public class Student {

    // ------------------------------------------------------ Fields/Properties:
    private String studentName;

    private ArrayList<Integer> grades;

    // ------------------------------------------------------ Constructor:
    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    // ------------------------------------------------------ returns the student's name:
    public String getStudentName() {
        return this.studentName;
    }

    // ------------------------------------------------------ adds the given grade to the grades property:
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // ------------------------------------------------------ returns the average of the students grades:
    public double getGradeAverage() {
        double container = 0.0;
        for (int grade : grades) {
            container += grade;
        }
        return container / grades.size();
    }

//    // ------------------------------------------------------ Main Method:
//    public static void main(String[] args) {
//        Student student = new Student("Tim");
//        student.addGrade(98);
//        student.addGrade(90);
//        student.addGrade(87);
//        student.addGrade(78);
//        student.addGrade(85);
//        System.out.println(student.grades);
//        System.out.println(student.getGradeAverage());
//    }


//        // -------------------------------------------------- Collection Lecture Notes:
//
//        List<String> iceCream = new ArrayList<>();
//        iceCream.add("vanilla");
//        iceCream.add("chocolate");
//        iceCream.add("strawberry");
//        iceCream.add("mint chocolate chip");
//        System.out.println(iceCream);
//        iceCream.set(2, "cookies and cream");
//        System.out.println(iceCream);
//        System.out.println(iceCream.get(3));
//        System.out.println(iceCream.indexOf("chocolate"));
//        System.out.println(iceCream.isEmpty());
//
//
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//
//        System.out.println(numbers);
//        System.out.println(numbers.size());
//        numbers.add(9);
//        numbers.add(10);
//        System.out.println(numbers);
//        numbers.add(0, 0);
//        System.out.println(numbers);
//        System.out.println(numbers.contains(-10));
//        System.out.println(numbers.contains(2));
//
//
//        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(10, 12, 13, 14, 15, 16, 17, 18));
//        // combining two arrays:
//        numbers.addAll(numbers2);
//        System.out.println(numbers);
//        Collections.reverse(numbers);
//        System.out.println(numbers);
//
//
//        // -------------------------------------------------- Hash Maps:
//
//        Map<String, String> usernames = new HashMap<>();
//        usernames.put("Ryan", "ryanorsinger");
//        usernames.put("Luis","MontealegreLuis");


}
