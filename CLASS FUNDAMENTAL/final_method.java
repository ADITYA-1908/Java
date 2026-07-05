class bike
{
    int speed=90;
   final void run()
    {
       speed=100;
       System.out.println(speed);
    }
}
public class final_method
{    
    public static void main(String[] args)
    {
        bike obj=new bike() ;
        obj.run();
    }
}
