
//Product of Array except Self Problem – Medium Level
//Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].
package NotOut150;

public class productOfArray {
    

    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,3};
        int product = 1;
        int zerocount = 0;

        for(int n : nums){
            if(n != 0){
                product *= n;
            }
            else {
                zerocount++;
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(zerocount > 1){
                nums[i] = 0;
            }
            else if ( zerocount == 1){
                if(nums[i] == 0){
                    nums[i] = product;
                }else {
                    nums[i] = 0;
                }
            }
            else {
                nums[i] = product/nums[i];
            }
        }

        for(int n : nums){
            System.out.println(n + " ");
        }
    }
}
