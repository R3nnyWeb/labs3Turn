import java.util.ArrayList;

public class Match {
    private TopGraph head;
    private ArrayList<TopGraph> matchingHeads;

    public Match(TopGraph head, ArrayList<TopGraph> matchingHeads) {
        this.head = head;
        this.matchingHeads = matchingHeads;
    }

    public void addMatchingHeads(TopGraph e){
        matchingHeads.add(e);
    }

    public TopGraph getHead() {
        return head;
    }

    public void setHead(TopGraph head) {
        this.head = head;
    }

    public ArrayList<TopGraph> getMatchingHeads() {
        return matchingHeads;
    }

    public void setMatchingHeads(ArrayList<TopGraph> matchingHeads) {
        this.matchingHeads = matchingHeads;
    }

    @Override
    public String toString() {
        return "Match{" +
                "head=" + head +
                ", matchingHeads=" + matchingHeads +
                '}';
    }
}
