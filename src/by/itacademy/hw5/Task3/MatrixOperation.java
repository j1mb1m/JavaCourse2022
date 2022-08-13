package by.itacademy.hw5.Task3;

public class MatrixOperation {

    public static Matrix multiply(Matrix matrix, int num) {
        int rows = matrix.getRows();
        int columns = matrix.getColumns();
        double[][] array = matrix.getArray();

        Matrix newMatrix = new Matrix(rows, columns);
        double[][] newArray = newMatrix.getArray();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[i][j] = array[i][j] * num;
            }
        }

        return newMatrix;
    }

    public static Matrix sum(Matrix matrixFirst, Matrix matrixSecond)  throws MatrixOperationException {

        if (matrixFirst.getColumns() == 0 || matrixFirst.getRows() == 0 || matrixSecond.getColumns() == 0 || matrixSecond.getRows() == 0 ) {
            throw new MatrixOperationException("Ошибка сложения. Матрицы пусты.");
        }
        if (matrixFirst.getColumns() != matrixSecond.getColumns() || matrixFirst.getRows() != matrixSecond.getRows()) {
            throw new MatrixOperationException("Ошибка сложения. Размерность матриц не совпадает.");
        }
        int rows = matrixFirst.getRows();
        int columns = matrixFirst.getColumns();

        Matrix newMatrix = new Matrix(rows, columns);

        double[][] arrayFirst = matrixFirst.getArray();
        double[][] arraySecond = matrixSecond.getArray();
        double[][] newArray = newMatrix.getArray();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[i][j] = arrayFirst[i][j] + arraySecond[i][j];
            }
        }

        return newMatrix;
    }

    public static Matrix multiply(Matrix matrixFirst, Matrix matrixSecond) throws MatrixOperationException {
        if (matrixFirst.getColumns() == 0 || matrixFirst.getRows() == 0 || matrixSecond.getColumns() == 0 || matrixSecond.getRows() == 0 ) {
            throw new MatrixOperationException("Ошибка сложения. Матрицы пусты.");
        }
        if (matrixFirst.getColumns() != matrixSecond.getRows()) {
            throw new MatrixOperationException("Ошибка умножения! Размерность колонок первой матрицы должна равняться размерности колонок второй матрицы.");
        }

        double[][] arrayFirst = matrixFirst.getArray();
        double[][] arraySecond = matrixSecond.getArray();

        Matrix newMatrix = new Matrix(matrixFirst.getRows(), matrixSecond.getColumns());
        double[][] newArray = newMatrix.getArray();

        for (int i = 0; i < newMatrix.getRows(); i++) {
            for (int j = 0; j < newMatrix.getColumns(); j++) {
                for (int k = 0; k < matrixSecond.getRows(); k++) {
                    newArray[i][j] += arrayFirst[i][k]*arraySecond[k][j];
                }
            }
        }
        return newMatrix;
    }
}
