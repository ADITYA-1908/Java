import java.util.Arrays;

public class arraysMethod {

    public static void main(String[] args) {

        // ====================================================
        // 1. length
        // ====================================================
        System.out.println("========== 1. length ==========");

        int[] arr1 = {10, 20, 30, 40, 50};

        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Length: " + arr1.length);

        // ====================================================
        // 2. Arrays.sort()
        // ====================================================
        System.out.println("\n========== 2. Arrays.sort() ==========");

        int[] arr2 = {50, 10, 40, 20, 30};

        System.out.println("Before Sorting: " + Arrays.toString(arr2));

        Arrays.sort(arr2);

        System.out.println("After Sorting : " + Arrays.toString(arr2));

        // ====================================================
        // 3. Arrays.binarySearch()
        // ====================================================
        System.out.println("\n========== 3. Arrays.binarySearch() ==========");

        int index = Arrays.binarySearch(arr2, 40);

        System.out.println("40 found at index : " + index);

        int notFound = Arrays.binarySearch(arr2, 100);

        System.out.println("100 found at index : " + notFound);

        // ====================================================
        // 4. Arrays.fill()
        // ====================================================
        System.out.println("\n========== 4. Arrays.fill() ==========");

        int[] arr3 = new int[5];

        Arrays.fill(arr3, 100);

        System.out.println(Arrays.toString(arr3));

        // ====================================================
        // 5. Arrays.copyOf()
        // ====================================================
        System.out.println("\n========== 5. Arrays.copyOf() ==========");

        int[] original = {10, 20, 30};

        int[] copy = Arrays.copyOf(original, 5);

        System.out.println("Original : " + Arrays.toString(original));
        System.out.println("Copy     : " + Arrays.toString(copy));

        // ====================================================
        // 6. Arrays.copyOfRange()
        // ====================================================
        System.out.println("\n========== 6. Arrays.copyOfRange() ==========");

        int[] range = Arrays.copyOfRange(arr1, 1, 4);

        System.out.println(Arrays.toString(range));

        // ====================================================
        // 7. Arrays.equals()
        // ====================================================
        System.out.println("\n========== 7. Arrays.equals() ==========");

        int[] a = {1, 2, 3};

        int[] b = {1, 2, 3};

        int[] c = {3, 2, 1};

        System.out.println(Arrays.equals(a, b));

        System.out.println(Arrays.equals(a, c));

        // ====================================================
        // 8. Arrays.deepEquals()
        // ====================================================
        System.out.println("\n========== 8. Arrays.deepEquals() ==========");

        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matrix2 = {
                {1, 2},
                {3, 4}
        };

        System.out.println(Arrays.deepEquals(matrix1, matrix2));

        // ====================================================
        // 9. Arrays.toString()
        // ====================================================
        System.out.println("\n========== 9. Arrays.toString() ==========");

        System.out.println(Arrays.toString(arr1));
        // ====================================================
        // 10. Arrays.deepToString()
        // ====================================================
        System.out.println("\n========== 10. Arrays.deepToString() ==========");

        System.out.println(Arrays.deepToString(matrix1));

        // ====================================================
        // 11. Arrays.compare()
        // ====================================================
        System.out.println("\n========== 11. Arrays.compare() ==========");

        int[] x = {1, 2, 3};

        int[] y = {1, 2, 4};

        System.out.println(Arrays.compare(x, y));

        System.out.println(Arrays.compare(y, x));

        System.out.println(Arrays.compare(x, x));

        // ====================================================
        // 12. Arrays.mismatch()
        // ====================================================
        System.out.println("\n========== 12. Arrays.mismatch() ==========");

        int[] m1 = {10, 20, 30, 40};

        int[] m2 = {10, 20, 99, 40};

        System.out.println(Arrays.mismatch(m1, m2));

        // ====================================================
        // 13. Arrays.parallelSort()
        // ====================================================
        System.out.println("\n========== 13. Arrays.parallelSort() ==========");

        int[] arr4 = {80, 30, 70, 20, 10, 50};

        System.out.println("Before : " + Arrays.toString(arr4));

        Arrays.parallelSort(arr4);

        System.out.println("After  : " + Arrays.toString(arr4));

        // ====================================================
        // 14. Arrays.stream()
        // ====================================================
        System.out.println("\n========== 14. Arrays.stream() ==========");

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = Arrays.stream(numbers).sum();

        int max = Arrays.stream(numbers).max().getAsInt();

        int min = Arrays.stream(numbers).min().getAsInt();

        double average = Arrays.stream(numbers).average().getAsDouble();

        long count = Arrays.stream(numbers).count();

        System.out.println("Sum     : " + sum);

        System.out.println("Max     : " + max);

        System.out.println("Min     : " + min);

        System.out.println("Average : " + average);

        System.out.println("Count   : " + count);
    }
}