
public class autoboxing {
    public static void main(String[] args) {
        int a = 10; // premitive
        Integer i = Integer.valueOf(a); // to objecct or this is called wapper class
        int p = i.intValue(); // autoboxing to premitive
        System.out.println(a + " " + i + " " + p);
    }
}
