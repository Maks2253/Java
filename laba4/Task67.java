import java.util.Arrays;

public class Task67 {
    public static void main(String[] args) {
        int[] A1 = {1, 3, 5};
        int[] B1 = {2, 4, 6};

        int[] A2 = {10, 20};
        int[] B2 = {30, 40, 50};  // різна довжина — помилка

        try {
            System.out.println("C = " + Arrays.toString(mergeArrays(A1, B1)));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            System.out.println("C = " + Arrays.toString(mergeArrays(A2, B2)));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public static int[] mergeArrays(int[] A, int[] B) {
        if (A == null || B == null)
            throw new NullPointerException("Масиви не можуть бути null");
        if (A.length != B.length)
            throw new IllegalArgumentException("Масиви повинні мати однакову довжину");

        int n = A.length;
        int[] C = new int[2 * n];
        for (int i = 0; i < n; i++) {
            C[2 * i] = A[i];
            C[2 * i + 1] = B[i];
        }
        return C;
    }
}
