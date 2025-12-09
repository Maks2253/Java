public class Task2 {

    public static void main(String[] args) {
        // Коректні варіанти
        System.out.println(intToBinaryString(21));   // 10101
        System.out.println(intToBinaryString(0));    // 0
        System.out.println(intToBinaryString(7));    // 111

        // Некоректний виклик (демонстрація)
        try {
            System.out.println(intToBinaryString(Integer.MIN_VALUE));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String intToBinaryString(int i) {
        // Перевірка аргументів (довільний приклад умов заборони)
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Argument too small");
        }

        // Якщо нуль — повертаємо "0"
        if (i == 0) return "0";

        StringBuilder binary = new StringBuilder();

        int value = Math.abs(i);

        while (value > 0) {
            int bit = value % 2;
            binary.append(bit);
            value /= 2;
        }

        binary.reverse();

        // Якщо число було від’ємним — додаємо знак мінус
        if (i < 0) {
            return "-" + binary.toString();
        }

        return binary.toString();
    }
}
