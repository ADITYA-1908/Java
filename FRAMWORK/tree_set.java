import java.util.*;
import java.util.jar.Attributes.Name;
public class tree_set {
    public static void main(String args[]) {
        // Creating and adding elements
        TreeSet<String> set = new TreeSet<String>();
        set.add("adi");
        set.add("subham");
        set.add("adi_subham");

        System.out.println("tree name= " + set);
    }
}