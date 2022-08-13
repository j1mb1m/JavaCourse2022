package by.itacademy.hw4;

/*1.	Необходимо вывести на экран таблицу умножения от 1 до 10.*/
public class Task1 {

    public static void main(String[] args) {
        printMultiplicationTable();
    }
    
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {

                System.out.printf("%2d x %2d = %3d", i, j, i*j);
                System.out.println();
            }
            System.out.println();
        }
    }
}
