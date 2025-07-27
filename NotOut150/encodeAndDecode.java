package NotOut150;
import java.util.*;

class codec{

    public String encode (List<String> str){
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s.length()).append("#").append(s);
        }   
        return sb.toString();
    }

    public List<String> decode (String s){
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            int j = i;
            while( s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i,j)); // why substring ? the number could be a two digit
            j++;
            String sub = s.substring(j,j+length);
            list.add(sub);
            i = j + length;
        }

        return list;
    }
   
}

public class encodeAndDecode {
    public static void main(String[] args) {
        codec ce = new codec();
        List<String> original = Arrays.asList("hello", "world", "this is # encoded", "123");

        String encoded = ce.encode(original);
        System.out.println("Encoded message is :"+ encoded);

        List<String> decode = ce.decode(encoded);
        
        System.out.println("Decoded message is "+ decode);
    }
}
