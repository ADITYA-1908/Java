import java.util.Scanner;
public class pt18
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,s,row,alpha=65;
        System.out.println("enter no of rows");
        row=sc.nextInt();
        for ( i = 1; i <=row; i++) 
        {
            for ( s = i; s <=row; s++) 
            {
                System.out.print(" ");    
            }
            for ( j = 1; j <=i; j++) 
            {
                System.out.print((char)(alpha));
                alpha++;
            }
            System.out.println();    

        }

    }
}