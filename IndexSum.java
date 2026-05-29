public class IndexSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int evenIndexSum = 0;
        int oddIndexSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndexSum += arr[i];
            } else {
                oddIndexSum += arr[i];
            }
        }

        System.out.println("Sum of Even Index Values = " + evenIndexSum);
        System.out.println("Sum of Odd Index Values = " + oddIndexSum);
    }
}