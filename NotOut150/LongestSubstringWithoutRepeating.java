package NotOut150.Array_and_Hashing;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String longestSubstring = solve(str);

        System.out.println("The longest substring without repeating characters is: " + longestSubstring);
        System.out.println("Length of substring is: " + longestSubstring.length());
    }

    static String solve(String str){
        int left = 0;
        int right = 0;
        int len = 0;
        int start = 0;
        int n = str.length();
        HashMap<Character,Integer> hash = new HashMap<>() ;

        while(right < n){
            if(hash.containsKey(str.charAt(right))){
                left = Math.max(hash.get(str.charAt(right)) + 1 , left);
            }
            if(right - left + 1 > len){
                len = right-left +1;
                start = left;
            }
            hash.put(str.charAt(right), right);
            right++;
        }
        return str.substring(start , start+len);
    }
}
