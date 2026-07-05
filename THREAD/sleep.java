 class test extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
             System.out.println(i);
        }
    }
}
public class sleep
{
    public static void main(String[] args) {
        test t=new test();
        t.start();
    }
}