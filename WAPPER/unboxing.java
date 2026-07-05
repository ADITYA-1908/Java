public class unboxing {
    public static void main(String[] args) {
        Integer a=new Integer(5); //wapper
        int i=a.intValue(); //premitive
        int p=a; //unboxing
        System.out.println(a+" "+i+" "+p);
    }    
}
