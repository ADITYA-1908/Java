import java.util.Scanner;
public class pt17
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,s,row;
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
                System.out.print(j);
                 
            }
            System.out.println();    

        }

    }
}