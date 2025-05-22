public class PrecedenceAndAssociativityInJava {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 8;
        // int k = a * b/2;
        // Result will be = 15 as per the Left to Right Associativity

        int k = (b*b) - (4*a*c)/(2*a);
        // k = 36 - 160 / 10
        // k = 36 - 16
        // k = 20
        // hence the result will be 20 as parenthesis will be solved first
        System.out.println("The Result will be: " + k);


    }
}
