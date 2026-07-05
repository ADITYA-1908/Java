import java.util.Scanner;
public class prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,i,c=0;
        System.out.println("enter the number ");
        num=sc.nextInt();
        for(i=1;i<=num;++i)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if (c==2) 
        {
            System.out.println("The number is prime ");    
        }
        else
        {
            System.out.println("The number is not prime");
        }
    }
}