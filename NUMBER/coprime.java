import java.util.Scanner;
//Two numbers A and B are said to be Co-Prime or mutually prime if the Greatest Common Divisor of them is 1.
public class coprime
{
    public static void main(String[] args)  
    {
        
        Scanner sc = new Scanner(System.in);
        int a,b,op=1,i;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        for ( i = 1; i <= a && i <= b; i++) 
        {
            if (a % i == 0 && b % i == 0)
            {
                op = i;
            }
        }
        
        if (op == 1)
        {
            System.out.println(a + " and " + b + " are co-prime");
        }
        else
        {
            System.out.println(a + " and " + b + " are not co-prime");
        }
    }
}