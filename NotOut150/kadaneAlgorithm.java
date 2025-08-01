package NotOut150.Array_and_Hashing;

public class kadaneAlgorithm {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
