package Ex2;

public class VectorsAction {
    public static double getScalarMultiplication(Vector v1, Vector v2){
        return  v1.getCoordX() * v2.getCoordX() + v1.getCoordY() * v2.getCoordY() + v1.getCoordZ() * v2.getCoordZ();
    }

    public static Vector sumTwoVectors(Vector v1, Vector v2){
        return new Vector((v1.getCoordX() + v2.getCoordX()), (v1.getCoordY()+ v2.getCoordY()), (v1.getCoordZ() + v2.getCoordZ()));
    }

    public  static  Vector multiplyingByConst(Vector v1, int constant ){
        return new Vector(v1.getCoordX() * constant, v1.getCoordY() * constant, v1.getCoordZ() * constant);
    }

    public static boolean isCollinear(Vector v1, Vector v2){
        double m = v1.getCoordX() / v2.getCoordX();
        return (m == v1.getCoordZ()/ v2.getCoordZ()) && (m == v1.getCoordY()/ v2.getCoordY());
    }

    public static boolean isOrthogonal(Vector v1, Vector v2){
        return (getScalarMultiplication(v1,v2) == 0);
    }
}
