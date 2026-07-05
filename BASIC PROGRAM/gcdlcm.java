import java.util.Scanner;
public class gcdlcm
{
    public static void main(String[] args) 
    {
        int a,b,c,d,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number ");
        a=sc.nextInt();  
        System.out.println("enter 2nd number ");
        b=sc.nextInt();
        c=a;
        d=b;
        while (a!=b) 
        {
            if(a>b)
            {
                a=a-b;
            }    
            else
            {
                b=b-a;
            }
        }    
        System.out.println("gcd of "+c+" and"+d+" is "+b);
        lcm=(c*d)/b;
        System.out.println("Lcm of "+c+" and "+d+" is "+lcm);
    }
}