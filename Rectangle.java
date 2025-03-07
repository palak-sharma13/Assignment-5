//Rectangle.java package shapes; 
 
import java.util.Scanner; 
 
public class Rectangle extends Shape {     private double length, width; 
 
    public Rectangle(double length, double width) { 
        this.length = length;         this.width = width; 
    } 
 
    @Override     public double getArea() {         return length * width; 
    } 
 
    public static Rectangle getInput() { 
        Scanner scanner = new Scanner(System.in); 
       System.out.print("Enter length: ");     double l = scanner.nextDouble(); 
 System.out.print("Enter width: "); double w = scanner.nextDouble(); return new Rectangle(l, w); 
}
}
