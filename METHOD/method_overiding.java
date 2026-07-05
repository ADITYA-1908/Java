class add1 {
     int add(int a, int b) {
        return a + b;
    }
}

class add2 extends add1 {
   
     int add(int a, int b,int c) {
        return a + b+c;
    }
}
public class method_overiding {
    public static void main(String[] args) {
        add1 a1 = new add1();
        add2 a2 = new add2();

        int sum1 = a1.add(1, 1);
        System.out.println(sum1);

        int sum2 = a2.add(1, 1,1);
        System.out.println(sum2);
    }
}
