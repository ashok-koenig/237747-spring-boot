package generic_demo;

public class GenericMethodExample {

    // Generic method
    public static <T> void displayData(T data){
        System.out.println("Data: "+ data);
    }

    public static <T> void printArray(T[] array){
        for(T element: array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        displayData(100);
        displayData("String data");
        displayData(true);
        printArray(new Integer[]{1, 2, 3, 4});
        printArray(new String[]{"John", "Smith", "Peter"});
    }

}
