class sum {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class method_overloading {
    public static void main(String[] args) {
        int p, q;
        sum op = new sum();
        p = op.add(1, 1);
        q = op.add(1, 1, 1);
        System.out.println(p);
        System.out.println(q);
    }
}
