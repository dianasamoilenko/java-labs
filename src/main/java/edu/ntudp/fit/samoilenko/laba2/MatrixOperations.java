package edu.ntudp.fit.samoilenko.laba2;
import java.util.Scanner;

public class MatrixOperations {
    public static final int MAX_SIZE = 20;
    public static final int MIN_SIZE = 1;
    public static final int MIN_RANDOM = 10;
    public static final int MAX_RANDOM = 25;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter size matrix");
        System.out.print("Enter number of columns: ");
        int x = matrixSizeValidation(in, "columns");

        System.out.print("Enter number of rows: ");
        int y = matrixSizeValidation(in, "rows");

        System.out.println("Choose how to create the matrix:");
        System.out.println("1. Manually");
        System.out.println("2. Randomly");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                int[][] matrixManually = createMatrixManually(x, y, in);
                printMatrix(matrixManually);
                calculateAndPrint(matrixManually);
                break;
            case 2:
                int[][] matrixRandomly = createMatrixRandomly(x, y);
                printMatrix(matrixRandomly);
                calculateAndPrint(matrixRandomly);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                break;
        }
    }

    public static int matrixSizeValidation(Scanner in, String element) {
        int num = in.nextInt();
        element = element.substring(0, 1).toUpperCase() + element.substring(1);

        while (num > MAX_SIZE || num < MIN_SIZE) {
            System.out.println(element + " must be between " + MIN_SIZE + " and " + MAX_SIZE);
            System.out.print("Please enter other count: ");
            num = in.nextInt();
        }

        return num;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void calculateAndPrint(int[][] matrix) {
        int min = getMinValue(matrix);
        int max = getMaxValue(matrix);
        double average = getAverage(matrix);
        double geometricMean = getGeometricMean(matrix);

        System.out.println("Minimum matrix element: " + min);
        System.out.println("Maximum matrix element: " + max);
        System.out.println("Matrix average: " + average);
        System.out.println("Geometric mean: " + geometricMean);
    }

    public static int[][] createMatrixRandomly(int sizeX, int sizeY) {
        int amountOfRandom = MAX_RANDOM + MIN_RANDOM + 1;
        int[][] matrix = new int[sizeX][sizeY];

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * amountOfRandom - MIN_RANDOM);
            }
        }

        return matrix;
    }

    public static int[][] createMatrixManually(int sizeX, int sizeY, Scanner in) {
        int[][] matrix = new int[sizeX][sizeY];

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print("Enter A[" + (i + 1) + ", " + (j + 1) + "] = ");
                matrix[i][j] = in.nextInt();
            }
        }

        return matrix;
    }

    public static int getMinValue(int[][] matrix) {
        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (min >= matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }

    public static int getMaxValue(int[][] matrix) {
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max <= matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    public static double getAverage(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }

        return (double) sum / (rows * columns);
    }

    public static double getGeometricMean(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int multiply = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multiply *= matrix[i][j];
            }
        }

        double geometricMean = Math.pow(multiply, 1.0 / (rows * columns));
        return geometricMean;
    }
}