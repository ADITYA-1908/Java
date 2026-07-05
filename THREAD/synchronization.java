class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    Table t;

    Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
        System.out.println("\n");
    }
}

class Thread2 extends Thread {
    Table t;

    Thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

class synchronization {
    public static void main(String ar[]) {
        Table obj = new Table();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}