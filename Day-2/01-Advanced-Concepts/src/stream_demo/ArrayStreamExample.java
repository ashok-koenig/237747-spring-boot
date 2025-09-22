package stream_demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamExample {
    public static void main(String[] args) {
        System.out.println("Streams from Array");
        String[] courses = {"HTML", "CSS", "JavaScript", "Java", "Spring Boot"};
        Stream<String> courseStream = Arrays.stream(courses);

        // Display the values in stream using forEach and Lambda express
//        courseStream.forEach( course -> System.out.println(course));

        // Display the values in stream using forEach and Method reference
        courseStream.forEach(System.out::println);
    }
}
