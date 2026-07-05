import java.util.Scanner;
public class cntdigit 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,cnt=0;
        System.out.println("enter the number");
        n=sc.nextInt();
        while (n!=0) 
        {
            n=n/10;
            cnt++;
        }
        System.out.println("it is a "+cnt+" digit number");
    }   
}
