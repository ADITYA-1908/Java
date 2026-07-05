import java.util.Scanner;
public class composite
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
               // break;
            }
        }
        if (c==2) 
        {
            System.out.println("The number is not a composite number");    
        }
        else
        {
            System.out.println("The number is a composite number");
        }
    }
}