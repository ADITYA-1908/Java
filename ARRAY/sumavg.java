import java.util.Scanner;
public class sumavg
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0,avg;
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
		for(i=0;i<=n;i++)
        {
            sum=sum+arr[i];
        }
		System.out.println("sum of the element in the array is "+sum);
		avg=sum/n;
		System.out.println("average of the element is "+avg);
    }
}