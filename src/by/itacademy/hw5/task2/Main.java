package by.itacademy.hw5.task2;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(1234567, "Samsung");
        Phone phone3 = new Phone(7985618, "Apple", 112.6);
        test(phone1);
        test(phone2);
        test(phone3);
    }
    public static void test(Phone phone){
        phone.receiveCall("Михаил");
        System.out.println("Мой номер " + phone.getNumber());
        phone.sendMessage(1235446, 5757456, 7897809);
        phone.receiveCall("Иван", 7867866);
        System.out.println();
    }

}
