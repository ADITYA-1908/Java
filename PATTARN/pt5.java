import java.util.Scanner;
public class pt5
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,row,n=1;
        System.out.println("enter no of rows");
        row=sc.nextInt();
        for ( i = 1; i <=row; i++) 
        {
            for ( j = 1; j <= i; j++) 
            {
                   System.out.print(n+" " );
                   n++;
            }
            System.out.println();    
        }
    }
}
