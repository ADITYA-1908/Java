class MyThread  {
    public void run() // Overriding run method
    {
        for (int i = 1; i <= 5; i++)
            System.out.println("Child Thread");
    }
}

public class thread_ex{
       public static void main(String ar[]) {
        MyThread t = new MyThread();
        t.run();
       }
}


