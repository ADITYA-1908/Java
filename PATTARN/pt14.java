import java.util.Scanner;
public class pt14
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,row;
        System.out.println("enter no of rows");
        row=sc.nextInt();
        for ( i = 1; i <=row; i++) 
        {
            for ( j = i; j <=row; j++) 
            {
                System.out.print(" ");    
            }
            for ( j = 1; j <=i; j++) 
            {
                System.out.print("*");    
            }
            System.out.println();    

        }

    }
}