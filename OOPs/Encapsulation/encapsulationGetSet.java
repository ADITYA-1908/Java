public class encapsulationGetSet {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age>0) {
            this.age=age;
        }else{
            System.out.println("invalid age");
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        encapsulationGetSet s1=new encapsulationGetSet();
        s1.setName("Aditya");
        s1.setAge(22);
        System.out.println("age"+s1.getAge());
        System.out.println("name"+s1.getName());
    }
}
