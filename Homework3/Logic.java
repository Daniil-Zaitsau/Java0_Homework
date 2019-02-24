public class Logic {

    // Определяет минимум и максимум
    public static void extremePoint(double[][] arr){
        double min = arr[0][0];
        double max = arr[0][0];

        for (double[] anArr : arr) {
            for (double anAnArr : anArr) {
                if (anAnArr > max){
                    max = anAnArr;
                }
                if (anAnArr < min) {
                    min = anAnArr;
                }
            }
        }

        System.out.println("\nMax value is: " + max + "." );
        System.out.println("Min value is: " + min + ".");
    }

    // Определяет среднее арифметическое и среднее геометрическое
    public static void average(double[][] arr){
        double sum = 0;
        double multiply = 1;
        int count = 0;

        for (double[] anArr : arr) {
            for (double anAnArr : anArr) {
                sum += anAnArr;
                multiply *= anAnArr;
                count++;
            }
        }

        System.out.println("\nArithmetic average is: " + sum/count + ".");
        System.out.println("Geometrical average is: " + Math.pow(multiply, 1. / count) + "\n");
    }

    // Определяет первый локальный минимум и максимум
    public static void localPoint(double[][]arr){

        boolean flagMax = true;
        boolean flagMin = true;

        for (int i = 0 ; i < arr.length & (flagMax | flagMin); i++){
            double maxStr = arr[i][0];
            double minStr = arr[i][0];

            int colMaxInd = 0;
            int colMinInd = 0;

            for (int k = 0 ; k < arr[i].length; k++) {
                if (arr[i][k] > maxStr){
                    maxStr = arr[i][k];
                    colMaxInd = k;

                }
                if (arr[i][k] < minStr){
                    minStr = arr[i][k];
                    colMinInd = k;
                }
            }

            if(i == 0){
                if (maxStr > arr[i+1][colMaxInd]){
                    System.out.println("First local max is: " + maxStr);
                    flagMax = false;
                }
                if (minStr < arr[i+1][colMinInd]){
                    System.out.println("First local min is: " + minStr);
                    flagMin = false;
                }
            } else if (i == arr.length - 1){
                if (maxStr > arr[i-1][colMaxInd] & flagMax){
                    System.out.println("First local max is: " + maxStr);
                    flagMax = false;
                }
                if (minStr < arr[i-1][colMinInd] & flagMin){
                    System.out.println("First local min is: " + minStr);
                    flagMin = false;
                }
            } else {
                if ((maxStr > arr[i-1][colMaxInd]) & (maxStr > arr[i+1][colMaxInd]) & flagMax){
                    System.out.println("First local max is: " + maxStr);
                    flagMax = false;
                }
                if ((minStr < arr[i-1][colMinInd]) & (minStr < arr[i+1][colMinInd]) & flagMin){
                    System.out.println("First local min is: " + minStr);
                    flagMin = false;
                }
            }
        }
    }

    // Транспонирует матрицу
    public static void transpon (double[][] arr){
        for (int i = 0 ; i < arr.length; i++){
            for (int k = i + 1 ; k < arr[i].length; k++) {
                double temp = arr[i][k];
                arr[i][k] = arr[k][i];
                arr[k][i] = temp;
            }
        }

        System.out.println("\nMatrix after transposition:");
        JavaTasks.matrix(arr);
    }
}
