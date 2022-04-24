package Ex3;

import java.util.ArrayList;

public class Text {
    ArrayList<Paragraph> paragraphs;

    Text(ArrayList<Paragraph> paragraphs){
        this.paragraphs = paragraphs;
    }

    @Override
    public String toString() {
        return paragraphs + "";
    }
}
