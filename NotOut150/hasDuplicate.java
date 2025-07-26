package NotOut150;
import java.util.*;
public class hasDuplicate
{
	public static void main(String[] args) {
	    int nums[] = {1,2,3,3};
		Set<Integer> set =new HashSet<>();
	    for(int n : nums){
	        set.add(n);
	    }
	    System.out.println( set.size() < nums.length);
	    
	}
}