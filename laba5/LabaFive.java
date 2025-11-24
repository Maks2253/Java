public class LabaFive {

    // --- Selection Sort (спадання) ---
    public static void selectionSortDesc(float[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            float temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // --- Insertion Sort (спадання) ---
    public static void insertionSortDesc(float[] arr) {
        for (int i = 1; i < arr.length; i++) {
            float key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        // Початковий масив
        float[] arr = { 3.2f, 1.5f, 7.8f, 2.4f, 9.1f, 0.6f };

        System.out.println("Початковий масив:");
        printArray(arr);

        // Копії масивів для двох методів
        float[] arr1 = arr.clone();
        float[] arr2 = arr.clone();

        // Сортування вибором
        selectionSortDesc(arr1);
        System.out.println("\nПісля Selection Sort (спадання):");
        printArray(arr1);

        // Сортування вставкою
        insertionSortDesc(arr2);
        System.out.println("\nПісля Insertion Sort (спадання):");
        printArray(arr2);
    }

    // Метод для виводу масиву
    public static void printArray(float[] arr) {
        for (float num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
