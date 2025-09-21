public class InheritanceDemo {
    public static void main(String[] args) {
        Person bob = new Person("Bob", "Anni", 25);
        bob.introduce();

        Student john = new Student("John", "Peter", 13, 90);
        john.introduce();

        Teacher ana = new Teacher("Ana", "Smith", 27, "Java");
        ana.introduce();
    }
}
