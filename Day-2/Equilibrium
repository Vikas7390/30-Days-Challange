import java.util.Scanner;

class EquilibriumIndex {
    public int equilibrium(int arr[], int len) {
        for (int i = 0; i < len; i++) {
            int leftsum = 0;
            for (int j = 0; j < i; j++) {
                leftsum += arr[j];
            }
            int rightsum = 0;
            for (int j = i + 1; j < len; j++) {
                rightsum += arr[j];
            }
            if (leftsum == rightsum)
                return i;
        }
        return -1;
    }
}

public class Equilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // length of the array
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();

        // Creating array
        int arr[] = new int[len];

        // Adding elements in the array
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the array
        System.out.print("Array elements: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Function call
        EquilibriumIndex eqi = new EquilibriumIndex();
        int result = eqi.equilibrium(arr, len);
        if (result != -1) {
            System.out.println("Equilibrium index is: " + result);
        } else {
            System.out.println("none");
        }

        sc.close();
    }
}
