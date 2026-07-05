class MyThread implements Runnable {
    public void run() // Overriding run method
    {
        for (int i = 1; i <= 3; i++)
            System.out.println("Sub Thread");
    }
}

public class Runnable_thread {
    public static void main(String[] args) {
        MyThread r = new MyThread();
        Thread t = new Thread(r);
        t.start();
        for (int i = 1; i <= 3; i++)
            System.out.println("The main Thread");
    }
} 