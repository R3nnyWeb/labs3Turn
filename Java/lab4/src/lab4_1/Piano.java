package lab4_1;

import java.util.ArrayList;

public class Piano {
    private ArrayList<Key> keys;

    Piano(int numButtons){
        keys = new ArrayList<Key>();
        for (int i=0; i<numButtons; ++i){
            keys.add(new Button(i+1));
        }
        keys.add(new Pedal(PedalType.LEFT));
        keys.add(new Pedal(PedalType.RIGHT));
    }

    public void play(int[] melody){
        try {
            for(int i : melody){
                keys.get(i).press();
            }
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Клавиша не найдена\n"+e.getMessage());
        }
    }

    public void config(){
        for(Key k : keys){
            k.configure();
        }
    }
}