public class Teacher extends Person{
    String subject;
    Teacher(String firstName, String lastName, int age, String subject){
        super(firstName, lastName, age);
        this.subject = subject;
    }
    public void introduce(){
        super.introduce();
        System.out.println("Handling subject is "+ subject);
    }
}
