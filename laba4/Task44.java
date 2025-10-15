public class Task44 {
    public static void main(String[] args) {
        int[] arr1 = { 3, 5, -10, 7, 8, 9, 2, -20, 4, 5, 6, 7, 8, 9, -30 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6 }; // жоден індекс не кратний 7
        int[] arr3 = {};                  // порожній масив

        System.out.println(findMaxByIndexMultipleOf7(arr1));

        try {
            System.out.println(findMaxByIndexMultipleOf7(arr2));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            System.out.println(findMaxByIndexMultipleOf7(arr3));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public static int findMaxByIndexMultipleOf7(int[] array) {
        if (array == null)
            throw new NullPointerException("Масив не може бути null");
        if (array.length == 0)
            throw new IllegalArgumentException("Масив порожній");

        Integer max = null;

        for (int i = 0; i < array.length; i++) { // Використано цикл for
            if (i % 7 == 0) {
                int val = Math.abs(array[i]);
                if (max == null || val > max)
                    max = val;
            }
        }

        if (max == null)
            throw new IllegalArgumentException("Немає індексів, кратних 7");

        return max;
    }
}
