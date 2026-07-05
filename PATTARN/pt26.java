import java.util.Scanner;
public class pt26
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,s,row,alpha=65;
        System.out.println("enter no of rows");
        row=sc.nextInt();
        for ( i = row; i >=0; i--) 
        {
            for ( s = row; s>=i; s--) 
            {
                System.out.print(" ");
            }
            for (j =0;j<=i;j++) 
            {
                System.out.print((char)(alpha));
                alpha++;
            }
            System.out.println();
        }
    }
}