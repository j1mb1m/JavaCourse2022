package by.itacademy.hw20.task1.service;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class InputFromScanner {

    private final String INCORRECT_INPUT_REPEAT = "The value is not correct! Repeat the input:";

    public String enterLogin(){

        return enterFromScanner("Enter your login:");
    }

    public String enterPassword(){

         return enterFromScanner("Enter your password:");
    }

    public String enterDate(String format){

        return enterFromScanner(String.format("Enter date (format '%s'):", format));

    }
    public String enterStartDate(String format){

        return enterFromScanner(String.format("Enter the beginning of the period (format '%s'):", format));

    }

    public String enterEndDate(String format){

        return enterFromScanner(String.format("Enter the end of the period (format '%s'):", format));

    }

    public String enterRoomNumber(){

        return enterFromScanner("Enter room number: ");
    }


    public String enterFromScanner(String msg){

        Scanner scanner = new Scanner(System.in);

        System.out.println(msg);
        return scanner.next();

    }

    public String enterFromScanner(){

        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }

    public int enterNumber(String msg){

        Scanner scanner = new Scanner(System.in);

        System.out.println(msg);

        while (!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.print(INCORRECT_INPUT_REPEAT );
        }
        return scanner.nextInt();
    }

    public BigDecimal enterBigDecimal(String msg){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println(msg);

        while (!scanner.hasNextBigDecimal()){
            scanner.next();
            System.out.print(INCORRECT_INPUT_REPEAT);
        }
        return scanner.nextBigDecimal();
    }
}
