package NotOut150.Array_and_Hashing;
//find second small and second largest;
public class secondLargest {
    static private int secondlargest (int arr[] , int n){
        int large = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > large){
                sl = large;
                large = arr[i];
            }
            else if (arr[i] > sl && arr[i] != large){
                sl = arr[i];
            }
        }
        return sl;
    }
    static private int secondSmallest(int arr[] , int n){
        int small = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] < small){
                ssmall = small;
                small = arr[i];
            }
            else if (arr[i] < ssmall && arr[i] != small){
                ssmall = arr[i];
            }
        }
        return ssmall;
    }
    public static void main(String[] args){

        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        int sS = secondSmallest(arr, n);
        int sL = secondlargest(arr, n);
        System.out.println("Second smallest is "+sS);
        System.out.println("Second largest is "+sL);

    }
}
