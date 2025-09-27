public class LabaThree2 {

    // Метод для обчислення значення функції
    public static double calculateX(int t, int i) {
        if (t <= 0) {
            throw new IllegalArgumentException("t must be a positive number");
        }

        switch (i) {
            case 1:
                return Math.sqrt(t);
            case 2:
                return 1.0 / Math.sqrt(t);
            default:
                double sum = 0.0;
                for (int k = 1; k <= t; k++) {
                    sum += k * t;
                }
                return sum;
        }
    }

    // Точка входу
    public static void main(String[] args) {
        try {
            System.out.println("Example 1 (t=4, i=1): " + calculateX(4, 1));  // sqrt(4) = 2
            System.out.println("Example 2 (t=9, i=2): " + calculateX(9, 2));  // 1/3
            System.out.println("Example 3 (t=3, i=5): " + calculateX(3, 5));  // (1+2+3)*3 = 18
            
            // Некоректні аргументи
            System.out.println("Example 4 (t=-2, i=1): " + calculateX(-2, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

