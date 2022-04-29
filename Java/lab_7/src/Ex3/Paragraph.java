package Ex3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Paragraph {
    private ArrayList<Sentence> sentences;

    Paragraph(ArrayList<Sentence> sentences){
        this.sentences = sentences;
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        return sentences.stream()
                .map(Sentence::toString)
                .collect(Collectors.joining(" "));
    }
}