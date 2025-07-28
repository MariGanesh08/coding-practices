package NotOut150.BitManipulation;

public class NumberOfOnes {
    public static void main(String[] args) {
        
        int n = 00000000000000000000000000010111;
        //inbuilt function
        System.out.println(Integer.bitCount(n));
        // Brian Kernighan's Algorithm
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        // traditional method
        // int count = 0;
        // for(int i = 0 ; i < 32 ; i++){
        //    int result = n ^ (1 << i);
        //    if(result == 0){
        //     count++;
        //    }
        // }

        System.out.println(count);
    }
}
