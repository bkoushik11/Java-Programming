public class Bits {
    public static void main(String[] args) {
        int n=5;
        int pos =2;
        int bitMask =1<<pos;
        int notBitMask = ~(bitMask);

         // get bit operation using binary and '&'
{
        if((bitMask & n) == 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
        // set bit to 1 using binary OR '|'
        {
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        }

        // clear operation
        // at a particular bit position whether it is 0  or 1 it is cleared to 0
        {
            int newNumber = notBitMask | n;
            System.out.println(newNumber);
            }
        
        
        // update bit operation
        // to set 0 at particular position use CLEAR

        // update bit operation
        // to set 1 at particular position use SET

    }
}
