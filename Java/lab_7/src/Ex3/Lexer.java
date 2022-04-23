package Ex3;

public class Lexer {
    private int pos;
    private char currentChar;
    private String text;

    private void advance(){
        pos++;
        if (pos < text.length()){
            currentChar = text.charAt(pos);
        }
        else currentChar = '\0';
    }

    

    private Word getWord(){
        StringBuilder result = new StringBuilder();
        while (currentChar != '\0'){
            result.append(currentChar);
            advance();
        }
        return new Word(result.toString());
    }

    public void setText(String text) {
        this.text = text;
        pos = 0;
        currentChar = text.charAt(0);
    }

    public Token getNextToken(){
        while (currentChar != '\0'){
            if(Character.isWhitespace(currentChar)){
                advance();
                continue;
            }
            if(Character.isLetter(currentChar)){
                return getWord();
            }

        }
        return null;
    }
}
