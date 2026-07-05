class bike
{
   final int speed=90;
    void run()
    {
       //speed=100;
       System.out.println(speed);
    }
}
public class final_keyword
{
    public static void main(String[] args)
    {
        bike obj=new bike() ;
        obj.run();
    }
}