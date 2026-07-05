import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList <String>name=new LinkedList <String>();
        name.add("adi");
        name.add("subham");
        System.out.println("name's are= "+name);
       
        //add element
        name.addFirst("sritam");
        name.addLast("adi_subham");
        System.out.println("name's are= "+name);

        //remove element
         name.removeFirst();
        System.out.println("name's are= "+name);

        name.removeLast();
        System.out.println("name's are= "+name);

        name.remove(0);
        name.remove("subham");
        System.out.println("name's are= "+name);
    }
}
