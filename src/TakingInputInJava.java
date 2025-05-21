import java.util.Scanner;
public class TakingInputInJava {
    public static void main(String[] args) {
        System.out.println("Taking input in Java");
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number 1: ");
//        float a = sc.nextFloat();
//        int a = sc.nextInt();
//        System.out.print("Enter Number 2: ");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        int sum = a+b;
//        float sum = a+b;
//        System.out.println("Sum of Number1 and Number2 is = " + sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

    }
}
