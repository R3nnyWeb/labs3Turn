package lab4_1;

public class Pedal implements Key{
    PedalType type;

    Pedal(PedalType pedalType){
        type = pedalType;
    }
    @Override
    public void press(){
        System.out.println(type+" педаль нажата ");
    }
    @Override
    public void configure(){
        System.out.println(type+" педаль настроена");
    }
}