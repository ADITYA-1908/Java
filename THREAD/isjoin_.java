class A extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
    }

}
public class isjoin_ {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException i) {
            System.out.println("exceotion");
        }

        t1.start();
        t3.start();
        // String name = Thread.currentThread().getName();
        // for (int i = 0; i < 3; i++) {
        //     System.out.println("op "+name);
        // }
    }
}
