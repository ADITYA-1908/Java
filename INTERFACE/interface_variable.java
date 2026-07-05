interface marks {
    int internal = 30;
    int external = 70;
    int totalmarks = 100;
}

class details implements marks {
    void display() {
        System.out.println("internal marks= " + internal);
        System.out.println("external marks= " + external);
        System.out.println("totalmarks marks= " + totalmarks);
    }
}

public class interface_variable {
    public static void main(String[] args) {
        details c = new details();
        c.display();
    }
}