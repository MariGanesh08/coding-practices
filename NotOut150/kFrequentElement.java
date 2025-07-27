
// Given an integer array nums and an integer k, return the k most frequent elements.
// You may return the answer in any order.

package NotOut150;

import java.util.*;
class frequent{
    public List<Integer> hash(int[] arr, int k){
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int n : arr){
            hashmap.put(n , hashmap.getOrDefault(n,0)+1);
        }

        List<Integer> buckets[] = new List[arr.length+1];

        for(int freq : hashmap.keySet()){
            int key = hashmap.get(freq);
            if(buckets[freq]== null){
                buckets[freq]  = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null)
                result.addAll(buckets[i]);
        }
        
    }
}

public class kFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        frequent fq = new frequent();
        

    }
}
