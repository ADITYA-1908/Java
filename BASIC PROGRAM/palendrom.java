//palendrom or not 
import java.util.Scanner;
public class palendrom 
{
    public static void main(String[] args)
    {
        int num,rem,sum=0,op;
        System.out.println("enter the number" );
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        op=num;
        while (num!=0) 
        {
            rem=num%10; 
            sum=sum*10+rem;
            num=num/10;
        }
        if (sum==op) 
        {
            System.out.println(op+" the number is palendrom");    
        }
        else
        {
            System.out.println(op+"the number not a palendrom");
        }
    }
}
