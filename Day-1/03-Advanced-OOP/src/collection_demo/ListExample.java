package collection_demo;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // String Array List
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        System.out.println("Fruits list: "+ fruits);

        // Integer Array List
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing an element
        System.out.println("First number: "+ numbers.get(0));

        Integer sum =0;
        for(Integer num: numbers){
            sum += num;
        }
        System.out.println("Sum of number: "+ sum);
    }
}
