package lab4_1;

public enum PedalType {
    LEFT,
    RIGHT,
    MIDDLE;

    @Override
    public String toString() {
        return switch (this) {
            case LEFT -> "Левая";
            case RIGHT -> "Правая";
            case MIDDLE -> "Средняя";
        };
    }
}