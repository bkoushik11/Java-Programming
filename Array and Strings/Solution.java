import java.util.Scanner;

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Initialize the maximum value with the first element
        int maxElement = arr[0];

        // Find the maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n4; i++) {
            arr[i] = sc.nextInt();
        }

        int result = largestElement(arr, n);
        System.out.println("The largest element in the array is: " + result);
    }
}

