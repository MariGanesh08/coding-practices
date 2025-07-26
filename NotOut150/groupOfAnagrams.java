package NotOut150;

import java.util.*;
public class groupOfAnagrams {
   public static List<List<String>> groupAnagrams(String arr[]){
       Map<String , List<String>> result = new HashMap<>();
       // key, [strings , strings]
       
       for(String  s : arr){
           int count[] = new int [26];
           for(char c : s.toCharArray()){
               count[c - 'a']++;
           }
           String key = Arrays.toString(count);
           result.putIfAbsent(key, new ArrayList<>());
           result.get(key).add(s);
       }
       return new ArrayList<>(result.values());
   }

    public static void main(String[] args) {
        String[] words = {"bat", "tab", "eat", "tea", "tan", "nat"};
        List<List<String>> output = groupAnagrams(words);
        System.out.println(output);
    }

}
