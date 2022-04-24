package Ex3;

import java.util.ArrayList;

public class Sentence {
    ArrayList<Token> tokens;

    Sentence(ArrayList<Token> tokens){
        this.tokens = tokens;
    }

    @Override
    public String toString() {
        return tokens + "";
    }
}
