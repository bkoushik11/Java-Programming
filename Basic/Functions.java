package Basic;

import java.util.Scanner;

public class Functions {
    public static int calculatorSum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        int sum=calculatorSum(a, b);
        System.out.println("sum of 2 numbers is:" +sum);
    }
}
