import java.util.Scanner;
public class revpyramid
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int row,i,j,s;
        System.out.println("Enter no of rows");
        row=sc.nextInt();
		for (i=row; i>=1; i--)
		{
			for ( s=row-i; s>=1; s--)
			{
				
				System.out.print(" ");
			}
			for ( j=1; j<=i; j++ )
			{	
				System.out.print("* ");
            }
			System.out.println();
		}
	}
}
