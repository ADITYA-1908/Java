import java.util.Scanner;
//a positive integer that eventually reaches 1 when you repeatedly replace it with the sum of the squares of its digits
public class happynum
{
     public static void main(String[] args) 
    {
        int n,r=1,num,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        num=n;
        while (n>9) 
        {
            while(n>0)
            {
                r=n%10;
                s=s+(r*r);
                n=n/10;
            }
            n=s;
            s=0;    
        }    
        if(n==1)
        {
            System.out.println(num+" is a happy number");
        }
        else
        {
            System.out.println(num+"is not a happy number");
        }
    }
}
