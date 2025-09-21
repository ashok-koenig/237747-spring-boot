package collection_demo;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "John");
        students.put(102, "Bob");
        students.put(103, "Smith");
        students.put(102, "Peter");

        System.out.println("Students Map: "+ students);

        // Accessing with key
        System.out.println("Student with roll number 101: "+ students.get(101));
    }
}
