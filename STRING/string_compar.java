public class string_compar {
    public static void main(String[] args) {
        
        String a="Lion";
        String b="Lion";
        //compare with respect to ASCIIE value
        if (a==b) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        String c="Lion";
        String d=new String("Lion");
        //compare with not respect to ASCIIE value
        if (c==d) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        } 
        
        String e="Lion";
        String f=new String("Lion");
        //compare with respect to ASCIIE value
        if (e.equals(f)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}