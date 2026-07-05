class A extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
    }

}

public class stop{
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");

        t2.start();
        t1.start();
        t3.start();
        t2.stop();
    }
}
