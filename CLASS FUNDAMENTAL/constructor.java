class add
{
    int a,b;
    add()
    {
        a=10;
        b=10;
    }
    int sum()
    {
        return a+b;
    }    
}
public class constructor
{
   public static void main(String[] args) 
    {
        int sum;
        add ad=new add();
        sum=ad.sum();
        System.out.println(sum);    
    }
}