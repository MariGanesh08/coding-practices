package NotOut150.Array_and_Hashing;

public class majorityElement {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        //refer note
        int count = 0;
        int element = 0;
        for(int n : arr){
            if(count == 0){
                element = n;
                count = 1;
            }
            else if(element == n){
                count++;
            }else {
                count--;
            }
        }

        count = 0;
        for(int n : arr){
            if( n == element) count++;
        }
        System.out.println( (count > arr.length/2) ? "yes" : "no");
    }
}
