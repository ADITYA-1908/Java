import java.util.Scanner;
public class magicnum
{
     public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n,num,sum=0,rem;
        System.out.println("enter the number to check");
        n=sc.nextInt();
        num=n;
        while(n>9)
        {
            while(n!=0)
            {
                rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            n=sum;
            sum=0;

        }
        if(n==1)
        {
            System.out.println("magic number" );
        }
        else
        {
            System.out.println("Not a magic number" );
        }
    }
}