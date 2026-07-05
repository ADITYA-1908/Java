//adi_subham
import java.util.Scanner;
public class twistedprime
{
     public static void main(String[] args) 
    {
        int n,sum=0,rem,c=0,i,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a prime number "); 
        n=sc.nextInt();
        num=n;
        while(n!=0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        for(i=1;i<=sum;i++)
        {
            if (sum%i==0) 
            {
                c++;    
            }
        }
        if(c==2)
        {
            System.out.println(num+" is a twisted prime number");
        }
        else
        {
            System.out.println(num+"is not a twisted prime number");
        }
    }
}
