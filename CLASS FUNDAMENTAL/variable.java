public class variable {
    int a=10; //instance
    static int b =20; //stratic
       public static void main(String[] args) {
           int c=30;//local
           variable p = new variable();
           System.out.println(p.a);
           System.out.println(variable.b);
           System.out.println(c);
   
       }
   }