package Ex3;

public abstract class Token {
    private String value;

    Token(String val){
        value = val;
    }

    @Override
    public String toString() {
        return value;
    }
}
