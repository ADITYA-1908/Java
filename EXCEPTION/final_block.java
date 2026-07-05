
public class final_block {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            int a,b,c;
            a=9;
            b=0;
            c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("not divisible by zero");
        }
        finally
        {
            System.out.println("final block executed");
        }
        System.out.println("End");
    }
}
