import java.util.Scanner;
public class pt7
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,row;
        char alpha='A';
        System.out.println("enter no of rows");
        row=sc.nextInt();
        for ( i = 0; i <=row; i++) 
        {
            for ( j = 0; j <= i; j++) 
            {
                System.out.print((alpha+" "));
                alpha++;    
            }
            System.out.println();    
        }
    }
}