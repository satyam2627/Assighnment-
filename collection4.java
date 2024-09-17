import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class collection4 {
    public static void main(String[] args) {
        Map<Integer,Integer> m1 = new HashMap<>();
        m1.put(1234, 96);
        m1.put(1235, 70);
        m1.put(1236, 88);
        m1.put(1237, 83);
        m1.put(1238, 79);
        m1.put(1239, 67);
        System.out.println(medallist(m1));

    }
    public static Map<Integer,String> medallist(Map<Integer,Integer>m1){
        Map<Integer,String> medal = new HashMap<>();
        // Set<Integer> set = m1.keySet();

        for (Map.Entry<Integer,Integer>entry:m1.entrySet()) {
            if (entry.getValue()>=90) {
                medal.put(entry.getKey(), "gold");
            }
            else if (entry.getValue()>=80 && entry.getValue()<90) {
                medal.put(entry.getKey(), "silver");
            }
            else if (entry.getValue()>=70 && entry.getValue()<80) {
                medal.put(entry.getKey(), "bronze");
            }
            else{
                medal.put(entry.getKey(), "none");
            }
        }
        return medal;
    }
}
