package stream_demo;

import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Smith", "Jane");
        Stream<String> nameStream = names.stream();
        System.out.println("Streams form Collection");
        nameStream.forEach(System.out::println);

        List<String> filteredNames = names.stream().filter(name-> name.startsWith("J")).toList();

        System.out.println("Filtered Names: "+ filteredNames);
    }
}
