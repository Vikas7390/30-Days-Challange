/* Given an array of the size N and Q queries of the format Start Index and End Index, Return the sum 
 sum of Elements from Index Start to End 
 Given array arr=[-3,6,2,4,5,2,8,-9,3,1]*/

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        System.out.println("enter the value of Q");
        int Q = sc.nextInt();
        for (int i = 1; i <= Q; i++) {
            System.out.println("Enter the value of Start Index:");
            int s = sc.nextInt();
            System.out.println("Enter the value of end Index:");
            int e = sc.nextInt();
            int sum = 0;
            for (int j = s; j <= e; j++) {
                sum = sum + arr[j];
            }
            System.out.println("The sum of the start and end index is:" + sum);
        }
    }
}
