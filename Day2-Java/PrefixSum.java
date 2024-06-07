import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("enter the values of the array");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the values that you entered are");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        // prefix sum
        int bcc[] = new int[len];
        bcc[0] = arr[0];
        for (int i = 1; i < len; i++) {
            bcc[i] = bcc[i - 1] + arr[i];
        }

        for (int i = 0; i < len; i++) {
            System.out.print(bcc[i] + " ");
        }
        // finding the equilibrium index
        for (int i = 1; i < len; i++) {
            if (bcc[i - 1] == bcc[len - 1] - bcc[i + 1 - 1]) {
                System.out.println("the value of the index is " + i);
            } else {
                System.out.println("no such number:");
            }
        }
    }
}
