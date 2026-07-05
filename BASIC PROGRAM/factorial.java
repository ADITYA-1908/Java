import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,i,fact=1;
        System.out.println("enter the number ");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial of a number is "+fact);
    }
}
