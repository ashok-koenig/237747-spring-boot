package stream_demo;

import java.util.List;

public class StreamSortExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Smith", "Jane");
        System.out.println("Sorted names:");
        names.stream().sorted().forEach(System.out::println);
    }
}
