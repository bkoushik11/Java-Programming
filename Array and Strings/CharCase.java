import java.util.Scanner;

public class CharCase {

    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int result;

        if (Character.isUpperCase(ch)) {
            result = 1;
        } else if (Character.isLowerCase(ch)) {
            result = 0;
        } else {
            result = -1;
        }

        System.out.println( + result);
    }
}

