package Ex3;

import java.util.ArrayList;

public class Paragraph {
    ArrayList<Sentence> sentences;

    Paragraph(ArrayList<Sentence> sentences){
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        return sentences + "";
    }
}
