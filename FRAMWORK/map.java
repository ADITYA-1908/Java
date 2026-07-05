
import java.util.*;

class map {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "adi");
        map.put(2, "subham");
        map.put(3, "adi_subham");

        System.out.println(map);
        //output== {1=adi, 2=subham, 3=adi_subham}
    }
}