package generic_demo;

class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generic Box");
        System.out.println("String box value: "+ stringBox.getValue());

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(1000);
        System.out.println("Integer box value: "+ integerBox.getValue());
    }
}
