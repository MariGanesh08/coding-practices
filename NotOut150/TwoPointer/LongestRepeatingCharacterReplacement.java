package NotOut150.TwoPointer;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
		String s = "AABABBA";
		int k = 1;
	
		int freq[] = new int[26];
		int maxlen = 0;
		int left  = 0;
		int maxfreq = 0;

		for(int right = 0; right < s.length() ; right++){
		    freq[s.charAt(right)-'A']++;
		    maxfreq = Math.max(maxfreq,freq[s.charAt(right) - 'A']);
	
		    	    
		    while( (right - left + 1) - maxfreq > k){
		        freq[s.charAt(left)-'A']--;
		        left++;
		    }
		    maxlen = Math.max(maxlen , right - left + 1);
		}
		System.out.println(maxlen);
	}
}
