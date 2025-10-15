public class Task14 {
    public static void main(String[] args) {
        int[][] testArrays = {
            {2, -5, 8, -3, 10, -7, 4},
            {0, -1, -9, 6, 3, 8},
            {1, 3, 5, 7},           // без парних — помилка
            {-2, -4, -6},           // без додатних парних — коректно
        };

        for (int[] arr : testArrays) {
            try {
                System.out.println("Результат: " + productOfAbs(arr));
            } catch (IllegalArgumentException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }
    }

    public static int productOfAbs(int[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Масив не може бути порожнім");

        Integer maxNegative = null;
        Integer minEven = null;

        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            if (val < 0) {
                if (maxNegative == null || val > maxNegative)
                    maxNegative = val;
            }
            if (val % 2 == 0) {
                if (minEven == null || val < minEven)
                    minEven = val;
            }
        }

        if (maxNegative == null)
            throw new IllegalArgumentException("Немає від’ємних елементів");
        if (minEven == null)
            throw new IllegalArgumentException("Немає парних елементів");

        return Math.abs(maxNegative) * Math.abs(minEven);
    }
}
