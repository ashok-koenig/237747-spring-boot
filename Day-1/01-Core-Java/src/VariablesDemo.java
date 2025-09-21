public class VariablesDemo {

    // Instance variable
    String course;

    // Static variable
    static int numberOfStudent = 2;

    void display(){
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // Local Variable
        String fullName = "John Smith";
        System.out.println("Welcome "+ fullName);

        // Create an object for the class
        VariablesDemo objName = new VariablesDemo();
        objName.course = "Java Full Stack";
//        System.out.println("Course: "+ objName.course);
        objName.display();

        // Create another object for the class
        VariablesDemo anotherObject = new VariablesDemo();
        anotherObject.course = "Angular";
//        System.out.println("Course: " + anotherObject.course);
        anotherObject.display();

        VariablesDemo.numberOfStudent = 1;
        // Access the static variable
        System.out.println("Number of Students: "+ VariablesDemo.numberOfStudent);
        System.out.println("Number of students: "+ objName.numberOfStudent);
        System.out.println("Number of students: "+ anotherObject.numberOfStudent);
    }
}
