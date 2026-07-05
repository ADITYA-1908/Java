import java.util.Scanner;
public class array
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
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
    }
}