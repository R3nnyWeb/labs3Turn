package Ex3;

import java.util.ArrayList;

public class Parser {
    private final Lexer lexer;
    Token currentToken;
    boolean notEOF;

    Parser(){
        lexer = new Lexer();
    }

    private void advance(){
        currentToken = lexer.getNextToken();
        if(currentToken == null){
            notEOF = false;
        }
    }

    private Sentence getSentence(){
        ArrayList<Token> tokens = new ArrayList<>();
        while (notEOF){
            tokens.add(currentToken);
            if(currentToken instanceof Punctuation){
                if(((Punctuation) currentToken).isEndMark()){
                    advance();
                    break;
                }
            }
            advance();
        }
        return new Sentence(tokens);
    }

    private Paragraph getParagraph(){
        ArrayList<Sentence> sentences = new ArrayList<>();
        while (notEOF){
            sentences.add(getSentence());
            if(notEOF && currentToken.toString().equals("\n")){
                advance();
                break;
            }
        }
        return new Paragraph(sentences);
    }

    public Text parseText(String text){
        lexer.setText(text);
        notEOF = true;
        advance();
        ArrayList<Paragraph> paragraphs = new ArrayList<>();
        while (notEOF){
            paragraphs.add(getParagraph());
        }
        return new Text(paragraphs);
    }
}