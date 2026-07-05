import java.util.Scanner;
public class largest
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max;
        System.out.println("enter no of element");
        n=sc.nextInt();
        int arr[]=new int[10];
        System.out.println("enter the element in the array");
        for(i=0;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(" element present in the array are");
        for(i=0;i<=n;i++)
        {
            System.out.println(arr[i]);
        }
		 max=arr[0];
		for(i=0;i<=n;i++)
        {
			if(arr[i]>max)
			{
				max=arr[i];
			}
        }
		System.out.println(max+" is largest element present in the array");
	}
}