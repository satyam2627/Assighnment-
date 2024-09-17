import java.util.*;

public class collection1 {

 public static void main(String[] args) {
    Map <String,String> m = new HashMap<String,String>();
    m.put("s", "Satyam");
    m.put("a", "Shubhangi");
    m.put("b", "aman");
    m.put("w", "aishwarya");
    m.put("l", "abhishek");
    m.put("c", "Raghav");
    m.put("e", "neeraj");
    // getvalue(m);
    List<String> li2 = new ArrayList<String>();
    li2= getvalue(m);
    System.out.println(li2);
 
}

public static List getvalue (Map<String, String> m ){
    Collection<String> values = m.values();
List<String> li = new ArrayList<String>(values); 

Collections.sort(li, new Comparator<String>() {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
    
}
);
return li;
}

}