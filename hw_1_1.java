import java.text.Format;

public class hw_1_1 {
    public static void main(String[] args) {
        int n = 3;
        double r = 0;
        double sum = 0;
        for (int i = 1; i < n + 1; i++) {
            r = 0.5 * i * (i + 1);
            sum = sum + r;
        }
        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact *= i;
        }
        System.out.printf("N-ое треугольное число = %.0f, сумма этих чисел от 1 до %d = %.0f, факториал числа %d = %d \n", r, n, sum, n, fact);
    }
}