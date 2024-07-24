package Basic;

import java.util.Scanner;

public class CalciSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers from 1 to 4 for arithmetic operations:");
        int n= sc.nextInt();{
            if(n>4){
                System.out.println("Inavlid number");
                
            }
            
        };
        {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("entered two numbers are "+a+ " and "+b);

       
        switch(n){
            case 1: int sum = a+b;
            {
                System.out.println("The addition of 2 numbers is:" +sum);
                break;
            }
            case 2 : int mul = a*b;
            {
                System.out.println("The multiplication of 2 numbers is:"+mul);
                break;
            }
            case 3 : int sub = a-b;
            {
                System.out.println("The subtraction of 2 numbers is:"+sub);
                break;
            }
            case 4 : int div = a/b;
            {
                System.out.println("The division of 2 numbers is:"+div);
                break;
            }
            default:{
                System.out.println("Enter only numbers");
                break;
            }
        }
    }
}
    
}
