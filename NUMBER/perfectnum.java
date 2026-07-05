import java.util.Scanner;
public class perfectnum 
{
    public static void main(String[] args)
    {
        int i,sum=0,n;
        System.out.println("enter the number" );
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            } 
        }
       if (sum==n) 
       {
           System.out.println(n+" is a perfect number");    
       }
       else
       {
           System.out.println(n+" is not a perfect number");
       }
       
    }   
}
