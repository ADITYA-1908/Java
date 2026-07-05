import java.util.Scanner;
public class fbseries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n1=0,n2=1,n3,cnt,i;    
          
        System.out.println("enter up to which you wants to print");
        cnt=sc.nextInt();

        System.out.println("fibonacci series:-\n"+n1+"\n"+n2);
        for(i=2;i<=cnt;i++)
        {
            n3=n1+n2;
            System.out.println(+n3);
            n1=n2;
            n2=n3;
        }  
    }   
}
