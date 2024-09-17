import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class collection2 {
    public static void main(String[] args) {
    
        Character  ch[] = {'a','b','c','a','d','a','e','f','g','d','e','f','b','b'};
        System.out.println(getcount(ch));
        
    }

    public static Map<Character,Integer> getcount(Character ch[]){
        Arrays.sort(ch);
         Integer count =1;
         Map <Character,Integer>m2 = new HashMap<>();
        for(int j=0;j<ch.length-1;j++){
            if (ch[j]==ch[j+1]) {
                count++;
            }
            else{
                m2.put(ch[j], count);
                count =1;
            }
        }
        return m2;
    }
}
