package exception_demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    static void readFile(String filename) throws FileNotFoundException,IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);
        System.out.println(reader.readLine());
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        int n1=10, n2=10, result =0;
        String str = "Welcome";
//        String str = null;
        try {
            System.out.println("String length: "+ str.length());
            if(n2 == 0){
                // Manually throwing exception by validating the data
                throw new ArithmeticException("n2 value can't be zero");
            }
            result = n1 / n2;
        }catch (ArithmeticException ae){
            System.out.println("ArithmeticException: "+ ae.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }finally {
            System.out.println("Always execute code");
        }

        System.out.println("Result: "+ result);
    }
}
