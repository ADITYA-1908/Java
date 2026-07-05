public class checked_exp {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        String file;
        file="/Desktop/adi.txt";
        Process p=rt.exec("nodepad "+file);
    }   
}
