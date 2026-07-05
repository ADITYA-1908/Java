public class nested_try {
    public static void main(String[] args) {
        try {
            try {
                int arr[] = { 1, 2, 3, 4 };
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("array index exceed");
            }

            String str = null;
            System.out.println(str.toUpperCase());

        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }
}
