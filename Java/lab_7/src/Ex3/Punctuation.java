package Ex3;

public class Punctuation extends Token{
    Punctuation(String mark){
        super(mark);
    }

    public boolean isEndMark(){
        return switch (toString()){
            case "," -> false;
            case ":" -> false;
            case ";" -> false;
            case "\n" -> false;
            default -> true;
        };
    }
}
