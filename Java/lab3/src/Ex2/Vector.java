package Ex2;

public class Vector {
    private double coordX;
    private double coordY;
    private double coordZ;

    public double getABSofVector(){
        return Math.sqrt(coordX * coordX + coordY * coordY + coordZ * coordZ);
    };


    //Конструктор
    public Vector(double coordX, double coordY, double coordZ) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.coordZ = coordZ;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                ", coordZ=" + coordZ +
                '}';
    }


    //геттеры и сеттеры
    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public double getCoordZ() {
        return coordZ;
    }

    public void setCoordZ(double coordZ) {
        this.coordZ = coordZ;
    }
}
