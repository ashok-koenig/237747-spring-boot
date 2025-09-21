//import mypackage.MyClass;

public class UserDefinedPackageDemo {
    public static void main(String[] args) {
        // MyClass from main/src package
        MyClass obj = new MyClass();
        obj.display();

        // MyClass from mypackage
        mypackage.MyClass obj1 = new mypackage.MyClass();
        obj1.display();

        //MyClass from mypackage1
        mypackage1.MyClass obj2 = new mypackage1.MyClass();
        obj2.display();
    }
}
