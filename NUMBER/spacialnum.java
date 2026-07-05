import java.util.Scanner;

public class spacialnum
{
    public static void main(String[] args)
    {
        
        int n, num, r,sum = 0,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (n > 0)
        {
            r = n % 10;
            int fact=1;
            for(i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            sum = sum+fact;
            n = n / 10;
        }
        if(num==sum)
        {
            System.out.println("Special Number" );
        }
        else
        {
            System.out.println("Not Special Number" );
        }
    }
}