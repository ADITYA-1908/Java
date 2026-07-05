public class multiple_catch {
    public static void main(String[] args) {
        try
        {
           int a ,b,c;
           a=10;
           b=0;
           c=a/b;
           System.out.println("c= "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("it is ArithmeticException 12 can't divisible by 0");
        }
        catch(ArrayIndexOutOfBoundsException e )
        {
            System.out.println("it is a ArrayIndexOutOfBoundsException e->array index exceed");
        }
        catch(NumberFormatException e)
        {
            System.out.println("no");
        }
    }
}
