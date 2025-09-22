package interface_demo;

interface Calculator {
    double PI=3.14;
    int add(int n1, int n2);
    int sub(int n1, int n2);
    int mul(int n1, int n2);
    default void welcome(){
        System.out.println("Welcome message");
    }
}

public class InterfaceExample implements Calculator{
    @Override
    public int add(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public int mul(int n1, int n2) {
        return n1*n2;
    }

    public static void main(String[] args) {
        Calculator calc = new InterfaceExample();
        System.out.println("Sum: "+ calc.add(10,20));
        System.out.println("Sub: "+ calc.sub(20,10));
        System.out.println("Mul: "+ calc.mul(10,20));
        calc.welcome();
        System.out.println("PI: "+ Calculator.PI);
    }
}
