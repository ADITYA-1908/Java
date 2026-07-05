import java.util.Scanner;
public class nivennum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,rem,op;
        System.out.println("enter the number");
        n=sc.nextInt();
        op=n;
        while (n!=0) 
        {
            rem=n%10; 
            sum=sum+rem;
            n=n/10;
        }
        if (op % sum==0) 
        {
            System.out.println(op+" is niven number");    
        }
        else
        {
            System.out.println(op+" is not a niven number");
        }
    }   
}
