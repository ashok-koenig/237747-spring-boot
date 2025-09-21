class Animal{
    void sound(){
        System.out.println("Animal sounds");
    }
}

class Cat extends Animal{
    // Parent class method sound() is overriding in the Cat class
    void sound(){
        System.out.println("Cat meows");
    }
}
public class OverridingDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}
