package Ex3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Text {
    ArrayList<Paragraph> paragraphs;

    Text(ArrayList<Paragraph> paragraphs){
        this.paragraphs = paragraphs;
    }

    @Override
    public String toString() {
        return paragraphs.stream()
                .map(Paragraph::toString)
                .collect(Collectors.joining("\n"));
    }
}
