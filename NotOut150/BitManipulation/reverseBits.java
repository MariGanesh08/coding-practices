package NotOut150.BitManipulation;
import java.util.*;

public class reverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int value = sc.nextInt();
        sc.close();

        long  result = 0;
        for(int i = 0 ; i < 32 ; i++){
            int bit = (value >> i) & 1;
            result |= ((long)bit << (31-i));
        }
        System.out.println(result);
    } 
}
