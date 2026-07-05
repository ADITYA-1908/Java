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

public class single {
    public static void main(String[] args) {
        car a = new car();
        a.fast();
        a.slow();
    }
}