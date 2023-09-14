import java.util.Scanner;
public class Task1 {
    static void Sum()
    {
        Scanner scan = new Scanner(System.in);
        double a, b, res;
        System.out.print("Введіть число a: ");
        a = scan.nextFloat();
        System.out.print("Введіть число b: ");
        b = scan.nextFloat();
        res = (a * b - (a + b) * (a - b)) / ((float)Math.pow(b, 4) + (float)Math.pow(a, 3)) + 5 * b;

        System.out.print("Результат: " +  Math.round(res * 1000.0) / 1000.0);
    }
    public static void main(String[] args) {
        Sum();
    }
}
