// Creating a class - Base class, Parent class or Super class
public class Person {
    // Attributes / Fields / Instance variables
    private String firstName;
    private String lastName;
    public int age;

    // default constructor
    Person(){
        firstName="";
        lastName="";
        age=0;
    }

    // Parameterized constructor
    Person(String fName, String lName, int a){
        firstName = fName;
        lastName = lName;
        age = a;
    }

    // Method / Function
    protected void introduce() {
        System.out.println("I'm "+ firstName + " " + lastName + " and "+ age + " years old");
    }

    public static void main(String[] args) {
        // Creating object for the class
        Person obj = new Person();
        obj.firstName = "John";
        obj.lastName = "Smith";
        obj.age = 25;
        obj.introduce();

        // Creating object for the class with initial values using paramerized constructor
        Person peter = new Person("Peter", "Smith", 25);
        peter.introduce();
    }
}
