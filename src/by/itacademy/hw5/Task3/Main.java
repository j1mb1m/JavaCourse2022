package by.itacademy.hw5.Task3;

public class Main {
    public static void main(String[] args) {
        testSum(5, 2, 2);
        testSum(0, 0, 2);
        testSum(1, 0, 2);
        testSum(5, 2, 5, 2);
        testSum(0, 0, 2, 0);
        testSum(1, 0, 0, 0);
        testMultiply(3, 2, 2, 5);
        testMultiply(0, 0, 2, 0);
        testMultiply(1, 0, 0, 0);

    }

    public static void testSum(int rows, int columns, int number) {
        Matrix matrix1 = new Matrix(rows, columns);
        matrix1.initRandom();

        System.out.println("Пример умножения матрицы на число " + number);
        System.out.print("Исходная матрица. ");
        matrix1.print();
        Matrix matrix2 = MatrixOperation.multiply(matrix1, number);
        System.out.print("Итоговая матрица. ");
        matrix2.print();
        System.out.println();
        System.out.println();

    }

    public static void testSum(int rowsFirstMatrix, int columnsFirstMatrix, int rowsSecondMatrix, int columnsSecondMatrix) {
        Matrix matrix1 = new Matrix(rowsFirstMatrix, columnsFirstMatrix);
        matrix1.initRandom();

        System.out.println("Пример сложения матрицы на матрицу");
        System.out.print("Первая матрица. ");
        matrix1.print();
        System.out.print("Вторая матрица. ");
        Matrix matrix2 = new Matrix(rowsSecondMatrix, columnsSecondMatrix);
        matrix2.initRandom();
        matrix2.print();
        System.out.print("Итоговая матрица. ");
        try {
            Matrix matrix3 = MatrixOperation.sum(matrix1, matrix2);
            matrix3.print();
        } catch (MatrixOperationException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println();

    }

    public static void testMultiply(int rowsFirstMatrix, int columnsFirstMatrix, int rowsSecondMatrix, int columnsSecondMatrix) {
        Matrix matrix1 = new Matrix(rowsFirstMatrix, columnsFirstMatrix);
        matrix1.initRandom();

        System.out.println("Пример умножения матрицы на матрицу");
        System.out.print("Первая матрица. ");
        matrix1.print();
        System.out.print("Вторая матрица. ");
        Matrix matrix2 = new Matrix(rowsSecondMatrix, columnsSecondMatrix);
        matrix2.initRandom();
        matrix2.print();
        System.out.print("Итоговая матрица. ");
        try {
            Matrix matrix3 = MatrixOperation.multiply(matrix1, matrix2);
            matrix3.print();
        } catch (MatrixOperationException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println();

    }
}
