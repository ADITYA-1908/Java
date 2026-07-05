package METHOD;

public class Method {

    // 1. No Return Type, No Parameters
    // This method only prints a message.
    public static void NRNP() {
        System.out.println("No Return, No Parameter");
    }

    // 2. Return Type, No Parameters
    // This method returns a fixed string.
    public static String RNNP() {
        return "Return, No Parameter";
    }

    // 3. No Return Type, With Parameters
    // This method takes input and prints it.
    public static void NRP(String message) {
        System.out.println(message);
    }

    // 4. Return Type, With Parameters
    // This method takes input and returns it.
    public static String RWP(String text) {
        return text;
    }

    public static void main(String[] args) {

        // Calling No Return, No Parameter
        NRNP();

        // Calling Return, No Parameter
        String result1 = RNNP();
        System.out.println(result1);

        // Calling No Return, With Parameter
        NRP("Hello Java");

        // Calling Return, With Parameter
        String result2 = RWP("Method with Return and Parameter");
        System.out.println(result2);
    }
}