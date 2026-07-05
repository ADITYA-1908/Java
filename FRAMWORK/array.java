import java.util.*;
public class array {
    public static void main(String args[]) {
      ArrayList <String> name=new ArrayList<String>();
      //add element in the array
      name.add("adi");
      name.add("subham");
      name.add("adi_subham");
      System.out.println("name's are= "+name);

      //remove element from the array
      name.remove(0); //by index
      System.out.println("name's are= "+name);
      name.remove("subham"); //by name
      System.out.println("name's are= "+name);

        //set element in the array
        name.set(0, "adi");
        System.out.println("name's are= "+name);

        //get element 
        String a=name.get(0);
        System.out.println(a);

        //delete
        name.clear();
        System.out.println("name's are= "+name);
    }
}


