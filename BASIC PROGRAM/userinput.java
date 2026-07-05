import java.util.Scanner;
public class userinput
{
     public static void main(String[] args) 
    {
        int a,b,sum;
        String m,n,add;
        Scanner sc = new Scanner(System.in);

        //integer input 
        System.out.println("enter the first number ");
        a=sc.nextInt();
        System.out.println("enter the second number ");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("sum of"+a+" and "+b+" is="+sum);

        //string input
        System.out.println("enter the first string ");
        m=sc.next();
        System.out.println("enter the second string ");
        n=sc.next();
        add=m+n;       
        System.out.println("string sum is "+add);
    }
}