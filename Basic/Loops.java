package Basic;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a=0; a<11; a++){
            System.out.print(a+" ");
        }
        int b=11;
        while(b<21){
            System.out.print(b+" ");
            b++;
        }
        int c=21;
        do{
            System.out.println(c);
            c++;
        }while(c<20);
        int sum=0;
        for(int d=1; d<=n; d++ ){
            sum=sum+d;
            
        }
        System.out.println(sum);
    }
}
