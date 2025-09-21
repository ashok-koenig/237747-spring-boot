public class ControlFlow {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        if(num1 == num2){
            System.out.println("num1 is equal to num2");
        }else{
            System.out.println("num1 is not equal to num2");
        }
        byte dayNumber = 1;
        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Unknown day number");
        }

        for (int i=0;i<10;i++){
            System.out.println(i);
        }

        int i=10;
        do{
            System.out.println(i++);
        }while (i<=15);
    }
}
