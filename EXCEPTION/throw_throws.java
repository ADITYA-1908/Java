public class throw_throws {
    public void test() 
    throws ArrayIndexOutOfBoundsException
    {
        int arr[]={1,2,3,4,5};
        System.out.println(arr[6]);
    }   
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cant divisible");
        }
        int age=16;
        if (age<18) {
            throw new ArithmeticException("cant vote");
        }
    }
}

