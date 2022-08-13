package by.itacademy.hw5.Task2;

public class Phone {
    public int number;
    public String model;
    public double weight;

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
