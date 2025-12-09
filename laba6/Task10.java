public class Task10 {

    public static void main(String[] args) {

        // Коректний приклад
        String text = "The user with the nickname koala757677 this month wrote 3 times more comments "
                     + "than the user with the nickname croco181dile920 4 months ago";

        System.out.println(uppercaseWords(text));

        // Некоректні виклики
        try {
            System.out.println(uppercaseWords(null));
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println(uppercaseWords(""));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String uppercaseWords(String sentence) {
        if (sentence == null) {
            throw new NullPointerException("Input string cannot be null");
        }
        if (sentence.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be empty");
        }

        // Розбиваємо з включенням розділювачів
        String[] tokens = sentence.split("(?=\\W)|(?<=\\W)");

        StringBuilder result = new StringBuilder();

        for (String token : tokens) {
            // Слово = тільки букви
            if (token.matches("[a-zA-Z]+")) {
                result.append(token.toUpperCase());
            } else {
                result.append(token);
            }
        }

        return result.toString();
    }
}
