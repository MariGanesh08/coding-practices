package NotOut150.BitManipulation;

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int result = 0;

        for(int i = 1 ; i <= arr.length+1 ; i++){
            result ^= i;
        }

        for(int i = 0 ; i < arr.length ; i++){
            result ^= arr[i];
        }
        System.out.println(result);
    }

}
