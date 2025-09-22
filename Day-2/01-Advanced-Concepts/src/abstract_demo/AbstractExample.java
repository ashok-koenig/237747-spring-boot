package abstract_demo;

abstract class MyClass{
    // Concrete method - with implementation
    void concreteMethod(){
        System.out.println("Concrete method called...");
    }
    // Abstract method - without implementation
    abstract void abstractMethod();
}

public class AbstractExample extends MyClass{
    @Override
    void abstractMethod() {
        System.out.println("Abstract method called...");
    }

    public static void main(String[] args) {
//        MyClass obj = new MyClass(); // Can't allowed to create object for abstract class
        AbstractExample obj = new AbstractExample();
        obj.concreteMethod();
        obj.abstractMethod();
    }
}
