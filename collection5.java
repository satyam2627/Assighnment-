import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collection5 {
    public static void main(String[] args) {
        Integer arr [] = {9,6,4,3,5,1,2,0};
        System.out.println(getsecondsmalles(arr));
    }

    public static int getsecondsmalles(Integer arr[]){
        // convert array to list 
        List <Integer>lii = Arrays.asList(arr);

        Collections.sort(lii);
        return lii.get(1);
        

    }
}
