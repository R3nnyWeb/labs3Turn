package Ex3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sentence {
    ArrayList<Token> tokens;

    Sentence(ArrayList<Token> tokens){
        this.tokens = tokens;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(tokens.get(0));
        for(int i = 1; i<tokens.size(); ++i){
            if(tokens.get(i) instanceof Word){
                result.append(" ");
            }
            result.append(tokens.get(i));
        }
        return result.toString();
    }
}