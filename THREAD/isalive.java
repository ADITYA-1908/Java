class A extends Thread
{

    public void run() {
        System.out.println("isalive program");
    }
}

public class isalive {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();

        System.out.println(t1.isAlive()); //before the start so it id false
        t1.start();
        System.out.println(t1.isAlive()); //after the start so it is true 
        t2.start();
        System.out.println(t2.isAlive());
    }
}
