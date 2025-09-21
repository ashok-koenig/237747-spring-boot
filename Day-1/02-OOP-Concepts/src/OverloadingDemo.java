// overloading - same method name and different number of parameter / type of parameter
class Calculator{
    int sum(int n1, int n2){
        return n1 + n2;
    }
    // Overloading with different number of parameters
    int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    // Overloading with different type of parameters
    double sum(double n1, double n2){
        return n1 + n2;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 integers: "+ calc.sum(100, 200));
        System.out.println("Sum of 3 integers: "+ calc.sum(10, 20, 30));
        System.out.println("Sum of 2 double: "+ calc.sum(100.5, 200.7));
    }
}
