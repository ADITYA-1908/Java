interface a {
    void show_a();
}

interface b extends a {
    void show_b();
}
class c implements b {
    public void show_a() {
        System.out.println("void show a");
    }

    public void show_b() {
        System.out.println("void show b");
    }
}
public class Extending_interface {
    public static void main(String[] args) {
        c op = new c();
        op.show_a();
        op.show_b();
    }
}