//Sphere.java package shapes; 
 
import java.util.Scanner; 
 
public class Sphere extends Shape implements Volume { 
    private double radius; 
 
    public Sphere(double radius) {         this.radius = radius; 
    } 
 
    @Override     public double getArea() {         return 4 * Math.PI * radius * radius; 
    } 
 
    @Override     public double getVolume() {         return (4.0 / 3) * Math.PI * radius * radius * radius; 
    } 
 
    public static Sphere getInput() { 
        Scanner scanner = new Scanner(System.in);         System.out.print("Enter radius: ");         double r = scanner.nextDouble();  	    return new Sphere(r); 
 	}
}
