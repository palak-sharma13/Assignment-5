//Shape.java package shapes; 
 
public abstract class Shape {     public abstract double getArea(); 
 
    public void display() { 
        System.out.println("Area: " + getArea()); 
    } 
} 
//Circle.java 
package shapes; 
 
import java.util.Scanner; 
 
public class Circle extends Shape {     private double radius; 
 
    public Circle(double radius) {         this.radius = radius; 
    } 
 
    @Override     public double getArea() {         return Math.PI * radius * radius; 
} 
public static Circle getInput() { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter radius: "); 
double r = scanner.nextDouble(); 
return new Circle(r); 
}
}
//Cylinder.java package shapes; 
 
import java.util.Scanner; 
 
public class Cylinder extends Shape implements Volume { 
    private double radius, height; 
 
    public Cylinder(double radius, double height) { 
        this.radius = radius;         this.height = height; 
    } 
 
    @Override     public double getArea() {         return 2 * Math.PI * radius * (radius + height); 
    } 
 
    @Override     public double getVolume() {         return Math.PI * radius * radius * height; 
    } 
public static Cylinder getInput() { 
 Scanner scanner = new Scanner(System.in); System.out.print("Enter radius: "); double r = scanner.nextDouble(); System.out.print("Enter height: "); double h = scanner.nextDouble();    return new Cylinder(r, h); 
   } 
} 
