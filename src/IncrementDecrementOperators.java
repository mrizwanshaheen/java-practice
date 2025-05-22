public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int y = 7;
        int x = ++y * 8;
        // The result of x will be 64 because first y will be incremented then multiply
        System.out.println("The result of this x: " + x);
        char a = 'b';
        System.out.println(++a);
        // The result will be c because first a will be incremented then print
    }
}
