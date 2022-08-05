package by.itacademy.hw4;

/*9.	*В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами
от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102
или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого
билета и теперь раздумывает, как много сувениров потребуется. Сколько счастливых
билетов в одном рулоне?*/
public class Task9 {
    public static void main(String[] args) {
        int numberOfTickets = 999999;
        System.out.println("Количество счастливых номеров : " + countLuckyTickets(numberOfTickets));
    }

    public static int countLuckyTickets(int numberOfTickets){
        int count = 0;
        while (numberOfTickets > 0){
            if (isLucky(numberOfTickets)){
                count++;
            }
            numberOfTickets--;
        }
        return count;
    }

    public static boolean isLucky(int num){
        int rightPart = num / 1000;
        int leftPart = num % 1000;

        return (sumNumbers(rightPart) == sumNumbers(leftPart));
    }

    public static int sumNumbers(int num){
        if (num == 0) return 0;

        int result = 0;
        while (num > 0){
            result += num % 10;
            num /= 10;
        }
        return result;
    }

}
