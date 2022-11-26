import java.util.Scanner;

public class hw_1_3 {
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = Input();
        int b = Input();
        char op = Oper();
        System.out.printf("%d %c %d = %d", a, op, b, Funct(a, b, op));
        iScanner.close();
    }
    public static int Input() {
        int a;
        System.out.println("Введите число = ");
        if (iScanner.hasNextInt()) {
            a = iScanner.nextInt();
        } else {
            iScanner.next();
            a = Input();
        }
        return a;
    }
    public static char Oper() {
        char a;
        System.out.println("Операция = ");
        if (iScanner.hasNext()) {
            a = iScanner.next().charAt(0);
        } else {
            iScanner.next();
            a = Oper();
        }
        return a;
    }
    public static int Funct(int a, int b, char op) {
        int result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Не верная операция");
                result = Funct(a, b, Oper());
                break;
        }
        return result;
    }

}
