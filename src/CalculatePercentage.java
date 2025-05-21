import java.util.Scanner;
public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of Subject1 = ");
        int a = sc.nextInt();
        System.out.print("Enter Marks of Subject2 = ");
        int b = sc.nextInt();
        System.out.print("Enter Marks of Subject3 = ");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("Your total marks are = " + sum);
        float d = 300f;
        double percentage = (sum/d)*100;
        System.out.println("Total percentage of your marks is = " + percentage);
    }
}
