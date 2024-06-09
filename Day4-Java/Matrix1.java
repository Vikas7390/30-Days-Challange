import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        System.out.println("Enter the values in the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Number of queries
        System.out.println("Enter the number of queries: ");
        int Q = sc.nextInt();

        for (int q = 0; q < Q; q++) {
            System.out.println("Enter the top-left and bottom-right coordinates (format: row1 col1 row2 col2): ");
            int row1 = sc.nextInt();
            int col1 = sc.nextInt();
            int row2 = sc.nextInt();
            int col2 = sc.nextInt();

            // Finding the sum of the given submatrix
            int result = findmatrix(arr, row1, col1, row2, col2);
            System.out.println("Sum of the submatrix: " + result);
        }
    }

    private static int findmatrix(int arr[][], int row1, int col1, int row2, int col2) {
        int result = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                result += arr[i][j];
            }
        }
        return result;
    }
}
