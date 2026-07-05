import java.util.Scanner;
public class table
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter the number");
        n=sc.nextInt();
        System.out.println("its a table of "+n);
        for(i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}