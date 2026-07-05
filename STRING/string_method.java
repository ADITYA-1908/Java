public class string_method {
    public static void main(String args[]) {
        char e;
        String a, b, c, d;
        a = "ADITYA";
        b = "subham";
        c = "    adi_subham    ";

        //! charAt(): Returns the character at a specified index
        System.out.println("charAt(0): " + a.charAt(0)); // A

        //! substring(): Returns a substring from index 2 to 4
        System.out.println("substring(2,5): " + a.substring(2, 5)); // ITY

        //! indexOf(): Returns index of first occurrence of 'Y'
        System.out.println("indexOf('Y'): " + a.indexOf('Y')); // 4

        //! lastIndexOf(): Returns last occurrence of 'A'
        System.out.println("lastIndexOf('A'): " + a.lastIndexOf('A')); // 5

        //! toLowerCase(): Converts all characters to lowercase
        System.out.println("toLowerCase(): " + a.toLowerCase()); // aditya

        //! toUpperCase(): Converts all characters to uppercase
        System.out.println("toUpperCase(): " + b.toUpperCase()); // SUBHAM

        //! concat(): Combines two strings
        System.out.println("concat(): " + a.concat(b)); // ADITYAsubham

        //! length(): Returns the length of string
        System.out.println("length(): " + a.length()); // 6

        //! trim(): Removes leading/trailing white spaces
        System.out.println("trim(): " + c.trim()); // adi_subham

        //! equals(): Checks if two strings are equal
        System.out.println("equals(): " + a.equals(b)); // false


        //! replace(): Replaces all 'A' with 'a'
        System.out.println("replace(): " + a.replace('A', 'a')); // aDITYa

        //! contains(): Checks if string contains a substring
        System.out.println("contains(): " + b.contains("ham")); // true

        //! startsWith(): Checks if string starts with "ADI"
        System.out.println("startsWith(): " + a.startsWith("ADI")); // true

        //! endsWith(): Checks if string ends with "YA"
        System.out.println("endsWith(): " + a.endsWith("YA")); // true

        //! isEmpty(): Checks if string is empty
        System.out.println("isEmpty(): " + a.isEmpty()); // false
    }
}