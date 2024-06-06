
/* Given an array of the size N and Q queries of the format Start Index and End Index, Return the sum 
 sum of Elements from Index Start to End 
 Given array arr=[-3,6,2,4,5,2,8,-9,3,1] */
// USING PREFIX SUM
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int len = arr.length;
        int pf[] = new int[len];

        // Calculate prefix sum
        pf[0] = arr[0];
        for (int i = 1; i < len; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }

        System.out.println("The prefix sum of the given array is:");
        for (int i = 0; i < len; i++) {
            System.out.print(pf[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Enter the number of queries (Q):");
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            System.out.println("Enter the start index:");
            int S = sc.nextInt();
            System.out.println("Enter the end index:");
            int E = sc.nextInt();

            int ans = 0;
            if (S == 0) {
                ans = pf[E];
            } else {
                ans = pf[E] - pf[S - 1];
            }
            System.out.println("The sum of elements from index " + S + " to " + E + " is: " + ans);
        }
    }
}
