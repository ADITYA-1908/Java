import java.util.*;

public class Local {
    public void display() {
        int b = 11;   // Local variable
        System.out.println(b);
    }

    public static void main(String[] args) {
        Local sc = new Local();
        sc.display();
        System.out.println("called");
    }
}