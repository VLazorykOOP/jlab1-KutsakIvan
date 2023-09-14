import java.util.Scanner;
public class Task3 {
    static  int InputSize() {
        int n;
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.print("Введіть розмір матриці(n, n<=20): ");
            n = scan.nextInt();
            if(n <= 20) break;
            else System.out.println("Введене вами число є більше за 20");
        }
        return n;
    }
    static void InputMatrix( float[][] matrix) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Заповніть матрицю");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
            {
                matrix[i][j] = scan.nextFloat();
            }
        }
    }

    static float AVG (float[][] matrix, int line)
    {
        float avg = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            avg += matrix[line][i];
        }
        avg /= matrix.length;

        return avg;
    }
    static float[] CreatVector(float[][] matrix)
    {
        float[] vector = new float[matrix.length];

        for(int i = 0; i < matrix.length; i++)
        {
            vector[i] = AVG(matrix, i);
        }

        return vector;
    }
    static void PrintVector(float[] vector)
    {
        for (float v : vector) System.out.print(Math.round(v * 1000.0) / 1000.0 + " ");
    }
    public static  void main(String[] args) {
        int n = InputSize();
        float[][] matrix = new float[n][n];
        InputMatrix(matrix);
        float[] B = CreatVector(matrix);

        System.out.print("Результат: ");
        PrintVector(B);
    }
}
