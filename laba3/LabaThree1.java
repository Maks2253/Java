public class LabaThree1 {

    // Метод для обчислення суми ряду
    public static double calculateSeries(double a, double b, int k) {
        // Перевірка аргументів
        if (k <= 0 || k > 30) {
            throw new IllegalArgumentException("k must be in the range (0; 30]");
        }
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("a and b must be positive numbers");
        }

        double sum = 0.0;
        for (int i = 1; i <= k; i++) {
            sum += Math.sqrt(a * i * Math.sqrt(b / i));
        }
        return sum;
    }

    // Точка входу
    public static void main(String[] args) {
        // Приклади запуску
        try {
            System.out.println("Example 1 (a=2, b=4, k=5): " + calculateSeries(2, 4, 5));
            System.out.println("Example 2 (a=1, b=2, k=10): " + calculateSeries(1, 2, 10));
            
            // Некоректні параметри
            System.out.println("Example 3 (a=-1, b=2, k=5): " + calculateSeries(-1, 2, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Некоректний k
            System.out.println("Example 4 (a=2, b=3, k=40): " + calculateSeries(2, 3, 40));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
