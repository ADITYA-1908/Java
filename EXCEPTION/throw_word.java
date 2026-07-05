import javax.management.openmbean.InvalidKeyException;
public class throw_word 
{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(arr[7]);
        throw new InvalidKeyException("out of index");
    }
}