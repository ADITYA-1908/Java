class emp {
    int id;
    String name;
    static String collage = "NIST";

    emp(int a, String b) {
        id = a;
        name = b;

    }

    void display() {
        System.out.println(id + " " + name + " " + collage);
    }

}

public class static_variable {
    public static void main(String[] args) {

        emp s1 = new emp(01, "adi");
        emp s2 = new emp(02, "subham");
        s1.display();
        s2.display();

    }
}