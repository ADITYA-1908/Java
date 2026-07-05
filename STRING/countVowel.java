import java.util.Scanner;

public class countVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str;
        str=sc.nextLine();
        int vl=0;
        int cl=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vl++;
            } else {
                cl++;
            }
        }
        System.out.println("vowel: "+vl);
        System.out.println("consonent: "+cl);
    }
}
