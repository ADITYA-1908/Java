import java.util.Scanner;
public class evenodd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		int arr[]=new int [100];
		System.out.println("enter no of element");
		n=sc.nextInt();
		
		System.out.println("enter the element in the array");
		for(i=0;i<=n;i++)
		{
			arr[i]=sc.nextInt();
		}

		//System.out.println("enter present in the array");
		for(i=0;i<=n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(i+"is a even number \n");
			}
			else
			{
				System.out.print(i+"is a odd number \n");
			}
		}
	}
}