package Ex3;

import java.util.ArrayList;
import java.util.HashMap;;

public class Sentence {
    private ArrayList<Token> tokens;

    Sentence(ArrayList<Token> tokens){
        this.tokens = tokens;
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

    public HashMap<String, Integer> findTokens(ArrayList<String> lexemes){
        HashMap<String, Integer> result = new HashMap<>();
        lexemes.forEach(word -> result.put(word, 0));
        for(Token word: tokens){
            String value = word.getValue().toLowerCase();
            if(lexemes.contains(value)){
                Integer n = result.get(value);
                result.put(value, n+1);
            }
        }
        return result;
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