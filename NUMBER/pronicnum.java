import java.util.Scanner;
public class pronicnum
{
    public static void main(String[] args)
    {
        int n,i,c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number=");
        n = sc.nextInt();       
        for(i=0;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                c=1;
                break;
            }
        }
        
        if(c==1)
        {
            System.out.println(n+" is pronic Number");
        }
        else
        {
            System.out.println(n+" is Not pronic Number");
        }
        
        
    }
}