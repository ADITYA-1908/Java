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

class truck extends car {
    void medium() {
        System.out.println("XUV200");
    }
}

public class multilevel {
    public static void main(String[] args) {
        truck a = new truck();
        a.medium();
        a.fast();
        a.slow();
    }
}