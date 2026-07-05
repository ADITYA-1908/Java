import java.util.Scanner;
public class neon 
{
    public static void main(String[] args)
    {
        int num,rem,sum=0,op,n;
        System.out.println("enter the number" );
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        op=n;
        num=n*n;
        while (num!=0) 
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;  
        }
       if (sum==op) 
       {
           System.out.println(op+" is a neon number");    
       }
       else
       {
           System.out.println(op+"is not a neon number");
       }
       
    }
}
