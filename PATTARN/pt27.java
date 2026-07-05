import java.util.Scanner;
public class pt27
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,s,row,n=1;
        System.out.println("enter no of rows");
        row=sc.nextInt();
        for ( i = row; i >=1; i--) 
        {
            for ( s = row; s>=i; s--) 
            {
                System.out.print(" ");
            }
            for (j =1;j<=i;j++) 
            {
                System.out.print(n+ " ");
                n++;
            }
            System.out.println();
        }
    }
}