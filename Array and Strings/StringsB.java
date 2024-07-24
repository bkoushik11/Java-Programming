public class StringsB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // chat at index 0
        System.out.println(sb.charAt(0));

        // insert char at specific index
        sb.insert(2, 'n');
        System.out.println(sb);


        // change char at index
        sb.setCharAt(0, 's');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(3, 4);
        System.out.println(sb);

        // append
        sb.append("s");
        sb.append("t");
        sb.append("ark");
        System.out.println(sb);
        System.out.println(sb.length());
        
        // string reverse 

        StringBuilder sc = new StringBuilder("hello");
        for(int i=0; i<sc.length()/2; i++){
            int front = i;
            int back = sc.length()-1-i;


            char frontChar = sc.charAt(front);
            char backChar = sc.charAt(back);

            sc.setCharAt(front, backChar);
            sc.setCharAt(back, frontChar);

        }
        System.out.println(sc);

        }

}
