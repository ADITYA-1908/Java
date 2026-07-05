import java.util.ArrayDeque;

public class queue {
    public static void main(String[] args) {
        ArrayDeque <String> name=new ArrayDeque<>();
        name.push("adi");
        name.push("subham");
        name.push("adi_subham");
        System.out.println("name's are= "+name);

        name.pop();
         System.out.println("name's are= "+name);

    }    
}
