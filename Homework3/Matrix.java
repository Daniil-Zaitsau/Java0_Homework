import java.util.Random;
import java.util.Scanner;

public class JavaTasks {

    public static void Matrix(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int column = 0;
        double rangeMin = 0;
        double rangeMax = 0;

        try {
            System.out.println("Enter matrix size:");
            row = scanner.nextInt();
            column = scanner.nextInt();

            System.out.println("\nMatrix will create from random numbers in some range.");

            System.out.println("Enter start point of the range:");
            rangeMin = scanner.nextDouble();

            System.out.println("Enter finish point of the range:");
            rangeMax = scanner.nextDouble();
        } catch (Exception e){
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if (rangeMin > rangeMax){
            System.out.println("Enter correct range!");
        } else {
            double[][] arr = new double[row][column];
            arrayInit(arr, rangeMin, rangeMax);

            System.out.println("\nYour matrix:");
            matrix(arr);

            Logic.extremePoint(arr);
            Logic.average(arr);
            Logic.localPoint(arr);
            Logic.transpon(arr);
        }
    }

    // Инициализирует массив
    private static void arrayInit(double[][] arr, double rangeMin, double rangeMax){
        Random random = new Random();
        for (int i = 0 ; i < arr.length; i++){
            for (int k = 0 ; k < arr[i].length; k++){
                arr[i][k] = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
            }
        }
    }

    // Выводит массив в виде матрицы
    public static void matrix(double [][] arr){
        for (double[] anArr : arr) {
            for (double anAnArr : anArr) {
                System.out.printf("%.7f ", anAnArr);
            }
            System.out.println();
        }
    }
}

