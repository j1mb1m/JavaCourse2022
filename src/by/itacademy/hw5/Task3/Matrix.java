package by.itacademy.hw5.Task3;

import java.util.Random;

public class Matrix {

    private final double[][] array;
    private final int columns;
    private final int rows;

    public Matrix( int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.array = new double[rows][columns];
    }

    public double[][] getArray() {
        return array;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public void initRandom(){
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(9999)*0.01;
            }
        }
    }

    public void print(){
        System.out.printf("Матрица %d x %d :%n", rows, columns);
        if(rows == 0 || columns == 0) System.out.println("<пусто>");
        for (double[] values : array) {
            for (double value: values) {
                System.out.printf("%10f   ", value);
            }
            System.out.println();
        }
    }
}
