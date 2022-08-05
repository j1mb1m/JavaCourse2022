package by.itacademy.hw3;


import java.util.Scanner;

/*6.	Вводятся длины трех сторон предполагаемого треугольника.
Определить, может ли существовать треугольник с такими сторонами
при условии что, треугольник существует только тогда, когда ни одна
его сторона не превышает сумму двух других.*/
public class Task6 {
   public static void main(String[] args) {

      int a = enterFromScanner();
      int b = enterFromScanner();
      int c = enterFromScanner();

      boolean isCorrect = checkSidesOfTriangle(a, b, c);
      if (isCorrect) {
         System.out.println("Треугольник существует");
      }
      else System.out.println("Треугольник не существует");
   }

   public static int enterFromScanner(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number >> ");
      while (!scanner.hasNextInt()) {
         scanner.nextLine();
         System.out.println("Error! Try again >> ");
      }
      int num = scanner.nextInt();

      return num;
   }
   public static boolean checkSidesOfTriangle(int a, int b, int c){

      if (a < 0 || b < 0 || c < 0) return false;
      else if (a + b > c && a + c > b && c + b > a)  return true;

      return false;
   }
}



