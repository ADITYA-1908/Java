import java.util.Scanner;
public class gratest
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner CV=new Scanner(System.in);
        System.out.println("entere the first number ");
        a=CV.nextInt();
        System.out.println("enter the second number ");
        b=CV.nextInt();
        System.out.println("enter the second number ");
        c=CV.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is gratest");
        }
        else if (b>a && b>c) 
        {
            System.out.println(b+"is gratest");
        } 
        else 
        {
            System.out.println(c+"is gratest");
            
        }
    }
}