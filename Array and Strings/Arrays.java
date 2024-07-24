import java.util.Scanner;

/**
 * Arrays
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // The array synatx is as follows:
        // int[]  marks = new int[3];

        // It can be also declared as below
        // int marks[]= new int[3];
        // marks[0]= 90;
        // marks[1]= 86;
        // marks[2]= 88;
        // To print a array in () arrayname with index number
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // To print n number of array elements create a for loop
        // for(int i=0; i<3; i++){

        //     System.out.println();
        // }

        int numbers[]=new int[size];

        // input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        

        // output
        for(int i=0; i<=numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("x found at index:" + i );
            }
        }
        
    }
}