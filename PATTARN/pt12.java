import java.util.Scanner;
public class pt12
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,j,row;
        int alpha=65;
        System.out.println("enter no of rows");
        row=sc.nextInt();
        for ( i = row; i >=0; i--) 
        {
            for ( j = 0; j <= i; j++) 
            {
                System.out.print((char)(alpha +i));
                
            }    
            System.out.println();    
        }
    }
}