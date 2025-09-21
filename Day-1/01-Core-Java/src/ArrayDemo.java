public class ArrayDemo {
    public static void main(String[] args) {
        // Creating an array with size
        int[] numbers = new int[10];
        numbers[0] = 10;
        System.out.println("First array element is: "+ numbers[0]);

        // Creating an array with initial values
        String[] nameList = {"John", "Smith", "Bob"};
//        System.out.println(nameList[0]);
//        System.out.println(nameList[1]);
//        System.out.println(nameList[2]);

        for(String name: nameList){
            System.out.println(name);
        }
    }
}
