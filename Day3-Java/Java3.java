import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {

        int arr[] = new int[]{2, 1, 3, 5, 4, 7};
        int pfev[] = new int[arr.length];
        int pfod[] = new int[arr.length];

        // Calculate prefix sums for even indices
        pfev[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                pfev[i] = pfev[i - 2] + arr[i];
            } else {
                pfev[i] = pfev[i - 1]; // Carry forward the previous sum
            }
        }

        // Calculate prefix sums for odd indices
        pfod[0] = 0; // Initialize first element to 0 because there's no odd index at the start
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                pfod[i] = (i - 2 >= 0 ? pfod[i - 2] : 0) + arr[i];
            } else {
                pfod[i] = pfod[i - 1]; // Carry forward the previous sum
            }
        }

        // Print the prefix sums for verification
        System.out.println("Even prefix sums:");
        for (int i = 0; i < pfev.length; i++) {
            System.out.print(pfev[i] + " ");
        }
        System.out.println();

        System.out.println("Odd prefix sums:");
        for (int i = 0; i < pfod.length; i++) {
            System.out.print(pfod[i] + " ");
        }
        System.out.println();

        // Example to demonstrate query processing
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of queries:");
        int Q = scanner.nextInt();
        for (int q = 0; q < Q; q++) {
            System.out.println("Enter start, end and type:");
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int type = scanner.nextInt();

            int result = 0;
            if (type == 1) { // Sum of even indices
                if (start == 0) {
                    result = pfev[end];
                } else {
                    result = pfev[end] - pfev[start - 1];
                }
            } else { // Sum of odd indices
                if (start == 0) {
                    result = pfod[end];
                } else {
                    result = pfod[end] - pfod[start - 1];
                }
            }

            // Print the result for the current query
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
