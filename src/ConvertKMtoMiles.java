import java.util.Scanner;
public class ConvertKMtoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in Km = ");
        float km = sc.nextFloat();
        double miles = km * 0.621371;
        System.out.print("Your Km in miles are " + miles);


    }
}
