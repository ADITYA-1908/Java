import java.util.Scanner;
public class pascaltriangle
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int rows,coef = 1,s,i,j;
        System.out.println("enter no of rows");
        rows=sc.nextInt();
        for (i = 0; i < rows; i++) 
        {
            for (s = 1; s <= rows -i; s++)
            {
                System.out.print(" "); 
            }
            for (j = 0; j <= i; j++) 
            {
                if (j == 0 || i == 0)
                coef = 1;
                else
                coef = coef * (i - j + 1) / j;
                System.out.print(" "+coef);
            }
            System.out.println("\n");
        }            
    }
}