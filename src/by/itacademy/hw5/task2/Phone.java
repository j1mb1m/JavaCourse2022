package by.itacademy.hw5.task2;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void sendMessage(int ... numbers){
        System.out.println("Сообщение отправлено следующим номерам:");
        for (int numberOut: numbers) {
            System.out.println("> " + numberOut);
        }
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int numberIn){
        System.out.println("Звонит " + name + " номер тел.: " + numberIn);
    }
}
