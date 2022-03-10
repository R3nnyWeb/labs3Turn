package lab4_1;

public class Button implements Key{
    int number;

    Button(int number){
        this.number = number;
    }
    @Override
    public void press(){
        System.out.println("Клавиша №"+number+" нажата");
    }
    @Override
    public void configure(){
        System.out.println("Клавиша №"+number+" настроена");
    }
}