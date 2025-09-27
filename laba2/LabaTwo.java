public class LabaTwo {
    public static void main(String[] args) {
        firstExercise();
        twoExercise();
        thirdExercise();
    }
    public static void firstExercise() {
        double a = 3.56;
        double b = 1.02;
        double c = 3.0;
        double d = 2.43;

        double numerator = Math.pow(Math.tan(a), 1.0 / 6.0); 
        double denominator = 1 + (Math.sinh(b) / Math.log(Math.abs(d + c)));

        double y = numerator / denominator;

        System.out.println("y = " + y);   
    }
    public static void twoExercise() {
        double a = 1.54;
        double b = 0.49;
        double c = 24.1;
        double d = 0.87;

        double firstPart = Math.sin(a) / Math.abs(Math.tan(b - a));
        double secondPart = Math.log(c) / d;

        double y = 2 * Math.sqrt(firstPart + secondPart);

        System.out.println("y = " + y);
    }
    public static void thirdExercise() {
     double a = 0.345  ; 
     double b = -2.25   ;
     double c = 2.65   ;
     double d = 3.99  ;
    double first = Math.cos(b)+Math.sin(Math.sqrt(a));
    double second = 2 * Math.log10(c) + Math.pow(Math.E, d);
    double y = first/second;

    System.out.println("y = " + y);
    }
}