import java.util.Scanner;
public class Task2 {
    static void Sum()
    {
        int n, size;
        float avg = 0, sum = 0;
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.print("Введіть розмір масиву(n, n<=200): ");
            n = scan.nextInt();
            if(n <= 200) break;
            else System.out.println("Введене вами число є більше за 200");
        }

        size = 2*n;
        float[] arr = new float[size];

        System.out.println("Заповніть масив");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scan.nextFloat();
            if(i < n) avg += arr[i];
        }
        avg /= n;

        for (int i = n; i < size; i++)
        {
            if(arr[i] > avg) sum += arr[i];
        }

        System.out.println("Результат: " + sum);
    }
    public static void main(String[] args) {
        Sum();
    }
}
