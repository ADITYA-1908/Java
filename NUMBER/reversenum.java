import java.util.Scanner;
public class reversenum 
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
            num=num/10;  
            sum=sum*10+rem;
        }
       System.out.println("the reverse of "+op+" is "+sum);
       
    }
   
}
