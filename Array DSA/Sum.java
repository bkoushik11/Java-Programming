import java.util.*;

public class Sum {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Main logic of the program starts here...
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        
        System.out.println(sum);;
    }
}

