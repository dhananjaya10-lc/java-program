public class SwapVariables {
    public static void main(String[] args) {

        // Declare variables
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping using third variable
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}