package variables;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Var2 {

    // Method to calculate the surface area of a cube
    public static double calculateCubeSurfaceArea(double side) {
        return 6 * Math.pow(side, 2);
    }

    // Method to calculate the surface area of a sphere
    public static double calculateSpharedSurfaceArea(double raduis) {
        return 4 * Math.PI * Math.pow(raduis, 2);
    }

    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {

        df.setRoundingMode(RoundingMode.DOWN);

        // Cube example
        double cubeSide = 5.0;  // Length of side of the cube
        double cubeSurfaceArea = calculateCubeSurfaceArea(cubeSide);
        System.out.println("Surface Area of Cube with side " + df.format(cubeSide) + ": " + cubeSurfaceArea);

        // Sphere example
        double sphereRadius = 7.0;  // Radius of the sphere
        double sphereSurfaceArea = calculateSpharedSurfaceArea(sphereRadius);
        System.out.println("Surface Area of Sphere with radius " + df.format(sphereRadius) + ": " + df.format(sphereSurfaceArea));

    }

}
