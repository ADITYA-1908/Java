class MyThread extends Thread {
    public void run() // Overriding run method
    {
        for (int i = 1; i <= 5; i++)
            System.out.println("Child Thread");
    }
}
public class Extend_thread {
       public static void main(String ar[]) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 1; i <= 5; i++)
            System.out.println("Main Thread");
    }
}