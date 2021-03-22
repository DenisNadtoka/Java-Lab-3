public class Vector_length {
    double x;
    double y;
    double z;

    public Vector_length (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector coordinates " +
                "x = " + x + ", y = " + y + ", z = " + z;
    }

    public double VectorLength(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}