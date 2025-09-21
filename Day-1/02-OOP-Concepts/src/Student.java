// Sub class, child class or derived class
public class Student extends Person{
    int mark;
    Student(String firstName, String lastName, int age, int mark){
        super(firstName, lastName, age);  // Calling the parent class constructor
        this.mark = mark;
    }
    // Overriding
    public void introduce(){
        super.introduce(); // call the parent class method from child class.
        System.out.println("Mark is "+ mark);
    }
}
