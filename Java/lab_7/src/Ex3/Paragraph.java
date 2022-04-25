package Ex3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Paragraph {
    ArrayList<Sentence> sentences;

    Paragraph(ArrayList<Sentence> sentences){
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        return sentences.stream()
                .map(Sentence::toString)
                .collect(Collectors.joining(" "));
    }
}
