class bike {
    void slow() {
        System.out.println("S1000RR");
    }
}

class car extends bike {
    void fast() {
        System.out.println("BMW");
    }
}

class truck extends bike {
    void medium() {
        System.out.println("XUV200");
    }
}

public class hierarchical {
    public static void main(String[] args) {
        truck a = new truck();
        car b = new car();
        b.fast();
        a.medium();
        a.slow();
    }
}