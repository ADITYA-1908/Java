class emp {
    int id;
    String name;
    static String collage = "NIST";

    static void change() {
        collage = "NIT";
    }

    void display() {
        System.out.println(id + " " + name + " " + collage);
    }
}

public class adiop {
    public static void main(String[] args) {

        emp.change();
        emp s1 = new emp();
        s1.id = 1;
        s1.name = "adi";

        emp s2 = new emp();
        s2.id = 2;
        s2.name = "subham";
        
        s1.display();
        s2.display();

    }
}