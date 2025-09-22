package lambda_demo;
// Function Interface
interface SimpleInterface {
    void display();
}

//class SimpleClass implements SimpleInterface{
//
//    @Override
//    public void display() {
//        System.out.println("Simple Class implements display method");
//    }
//}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

        MathOperation addition = (x, y) -> x + y;
        System.out.println("Sum: "+ addition.operate(10,20));

        MathOperation multiplication = (x, y) -> x * y;
        System.out.println("Product: "+ multiplication.operate(10,20));

//        SimpleClass obj = new SimpleClass();
//        obj.display();

        SimpleInterface welcome = () -> System.out.println("Welcome to Lambda expression");
        welcome.display();
    }
}
