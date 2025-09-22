package generic_demo;

interface Printable<T> {
    void print(T value);
}

class Printer<T> implements Printable<T>{

    @Override
    public void print(T value) {
        System.out.println("Printing; "+ value);
    }
}

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Printable<String> stringPrintable = new Printer<>();
        stringPrintable.print("Working with generic interface");

        Printable<Integer> integerPrintable = new Printer<>();
        integerPrintable.print(1000);
    }
}
