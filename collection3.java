import java.util.HashMap;
import java.util.Map;

public class collection3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(squarenum(arr));

        }
        public static Map<Integer,Integer> squarenum(int arr[]){
            Map<Integer,Integer> m = new HashMap<>();

            for(int i=0;i<arr.length;i++)
            {
                int result =0;
                result = arr[i]*arr[i];
                m.put(arr[i], result);
            }
            return m;

        }
}
