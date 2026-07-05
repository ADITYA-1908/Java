import java.util.Scanner;
public class spynum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,rem,op,pd=1;
        System.out.println("enter the number");
        n=sc.nextInt();
        op=n;
        while (n!=0) 
        {
            rem=n%10; 
            sum=sum+rem;
            pd=pd*rem;
            n=n/10;
        }
        if (sum==pd) 
        {
            System.out.println(op+" is spy number");    
        }
        else
        {
            System.out.println(op+" is not a spy number");
        }
    }   
}
