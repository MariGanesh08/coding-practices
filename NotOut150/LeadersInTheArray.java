package NotOut150.Array_and_Hashing;

public class LeadersInTheArray {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        
        int maxfromright = arr[n-1];
        System.out.print(maxfromright + " ");

        for(int i = n-2 ; i >= 0 ; i--){
            if(arr[i] > maxfromright){
                maxfromright= arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }
}
