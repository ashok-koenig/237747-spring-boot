package reflection_demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

class Temp {
    int field1 = 2;
    public String field2 = "Public field";
    private static final String field3 = "Fixed private field";
}

public class ReflectionExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Normal way of creating object
        Temp temp = new Temp();

        // Reflection way of creating object
        Temp temp1 = Temp.class.getDeclaredConstructor().newInstance();

//        System.out.println("Field 1: "+ temp1.field1);

        Field[] fields = Temp.class.getDeclaredFields();
        System.out.println("All fields: "+ Arrays.toString(fields));

        for(Field field: fields){
            field.setAccessible(true);
            System.out.println(field);
            System.out.println(field.get(temp1));
        }
    }
}
