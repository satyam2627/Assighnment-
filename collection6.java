import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class collection6 {
    public static void main(String[] args) {
        Map<Integer,Integer> identity = new HashMap<>();
        identity.put(1234, 23);
        identity.put(1235, 19);
        identity.put(1236, 15);
        identity.put(1237, 21);
        identity.put(1238, 3);
            System.out.println(getvotingdetail(identity)+" will be having the voting right ");
        
        



    };

    public static List<Integer> getvotingdetail(Map<Integer,Integer>m1){

        List <Integer> lii = new ArrayList<>();        
            for(Map.Entry<Integer,Integer> entry:m1.entrySet()){
                if (entry.getValue()>=18) {
                    lii.add(entry.getKey());
                }
            }
            return lii;
    }
}
