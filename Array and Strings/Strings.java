import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // string declaration
        String firstname = "Tony ";
        String lastname = "stark";

        // String concatenation
        String fullname = firstname+lastname;
        System.out.println(fullname);
        // length of string
        System.out.println(fullname.length());

        // case 1 string1> string2 : +ve value
        // case 2 s1 == s2 : 0
        // case 3 s1<s2 : -ve value

        if(firstname.compareTo(lastname)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is : " +name);

        String sentence = "My name is Tony";
        String n1 = sentence.substring(11, sentence.length());
        System.out.println(n1);

        // strings are immutable

    }
}
