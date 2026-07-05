public class Employees{

    String name;
    static String company = "Google";

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name + " works at " + company);
    }

    public static void main(String[] args) {

        Employees e1 = new Employees("Aditya");
        Employees e2 = new Employees("Rahul");

        e1.display();
        e2.display();
    }
}