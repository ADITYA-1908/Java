import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<String> name = new Stack<String>();

        name.push("adi");
        name.push("subham");
        name.push("adi_subham");
        System.out.println("pushed lelment are= " + name);

        name.pop();
        System.out.println("poped element is= " + name);

        name.peek();
        System.out.println("peek element are= " + name);
    }
}
