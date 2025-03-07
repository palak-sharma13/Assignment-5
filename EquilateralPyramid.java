//EquilateralPyramid.java package shapes; 
 
import java.util.Scanner; 
 
public class EquilateralPyramid extends Shape implements Volume {     private double base, height; 
 
    public EquilateralPyramid(double base, double height) {         this.base = base;         this.height = height; 
    } 
 
    @Override     public double getArea() {         return base * base + 2 * base * height; 
    } 
 
    @Override     public double getVolume() {         return (1.0 / 3) * base * base * height; 
} 
public static EquilateralPyramid getInput() { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter base length: "); 
double b = scanner.nextDouble(); 
System.out.print("Enter height: ");    double h = scanner.nextDouble();        return new EquilateralPyramid(b, h); 
    } 
} 
