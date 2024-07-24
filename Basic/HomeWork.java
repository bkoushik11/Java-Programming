package Basic;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n%2 !=0){
        
            
            System.out.println("Enter only even numbers"); 
    }
    else {
        for(int i=2;i<=n;i+=2){
        System.out.println("Even numbers are: "+i);
    }
        
        }
        
    }
    }

