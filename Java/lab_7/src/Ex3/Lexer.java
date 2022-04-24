package Ex3;

import java.util.HashSet;

public class Lexer {
    private int pos;
    private char currentChar;
    private String text;
    private final HashSet<Character> punctuations;

    Lexer(){
        punctuations = new HashSet<>();
        punctuations.add('.');
        punctuations.add('!');
        punctuations.add('?');
        punctuations.add(',');
        punctuations.add(';');
        punctuations.add(':');
    }

    private void advance(){
        pos++;
        if (pos < text.length()){
            currentChar = text.charAt(pos);
        }
        else currentChar = '\0';
    }

    private char next_char(int next){
        int nextPos = pos + next;
        if (nextPos < text.length()){
            return text.charAt(nextPos);
        }
        else return '\0';
    }

    private Word getWord(){
        StringBuilder result = new StringBuilder();
        while (Character.isLetter(currentChar) && currentChar != '\0'){
            result.append(currentChar);
            advance();
        }
        return new Word(result.toString());
    }

    public Token getNextToken(){
        while (currentChar != '\0'){
            if (currentChar == '\n'){
                advance();
                return new Punctuation("\n");
            }
            if(Character.isWhitespace(currentChar)){
                advance();
                continue;
            }
            if(Character.isLetter(currentChar)){
                return getWord();
            }
            if(currentChar == '.' && next_char(1) == '.' && next_char(2) == '.'){
                advance();  advance();  advance();
                return new Punctuation("...");
            }
            if(punctuations.contains(currentChar)){
                String mark = Character.toString(currentChar);
                advance();
                return new Punctuation(mark);
            }
            throw new RuntimeException("Лексическая ошибка: неизвестный символ '" + currentChar + "'");
        }
        return null;
    }

    public void setText(String text) {
        this.text = text;
        pos = 0;
        currentChar = text.charAt(0);
    }
}