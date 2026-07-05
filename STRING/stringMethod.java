public class stringMethod {
    public static void main(String[] args) {
        //aysync - suport multitrading - immutable 
        StringBuilder sb = new StringBuilder("qq");
        sb.append("ee");
        
        System.out.println(sb);

        //sync - not suport multitrading - immutable 
        StringBuffer d= new StringBuffer("rr");
        d.append("ww");
        System.out.println(d);
    }
}
