import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x \n");
        double x = in.nextDouble();
        System.out.print("Enter x \n");
        double y = in.nextDouble();
        System.out.print("Enter x \n");
        double z = in.nextDouble();

        Vector_length vector = new Vector_length(x, y, z);
        System.out.println(vector);
        System.out.println("Vector length = " + vector.VectorLength());
    }
}
