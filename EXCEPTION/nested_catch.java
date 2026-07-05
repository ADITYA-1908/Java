public class nested_catch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("b= " + b);
        } catch (ArithmeticException a) {
            try {
                String str = null;
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
            }
            System.out.println("ArithmeticException");
        }
    }
}
