public class LabaThree3 {

    // Метод для обчислення суми ряду з точністю epsilon
    public static double calculateSeries(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("epsilon повинно бути > 0");
        }

        double sum = 0.0;
        double term;
        int i = 1;
        long factorial = 1;

        while (true) {
            factorial *= i; // обчислення i!
            term = Math.pow(-1, i) / (double) factorial;

            if (Math.abs(term) < epsilon) {
                break; // досягли потрібної точності
            }

            sum += term;
            i++;
        }

        return sum;
    }

    // Точка входу
    public static void main(String[] args) {
        try {
            System.out.println("Сума при epsilon=0.01: " + calculateSeries(0.01));
            System.out.println("Сума при epsilon=0.0001: " + calculateSeries(0.0001));

            // Некоректний приклад
            System.out.println("Сума при epsilon=-0.5: " + calculateSeries(-0.5));
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}

