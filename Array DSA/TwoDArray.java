import java.util.*;

public class TwoDArray {

    public static void main(String[] args) {
        int [][] arr = new int[5][6];

        // set value at array index 
        arr[2][3] =11;

        // get array
        System.out.println(arr[2][3]);

        // row count
        System.out.println(arr.length);

        // col count
        System.out.println(arr[0].length);

        // traversal
        for(int i=0; i<arr.length; i++){ //for row print
            for(int j=0; j<arr[0].length; j++){ //col print
                // processing
            }
        }
    }
}
