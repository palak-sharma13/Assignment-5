//Square.java package shapes; 
 
import java.util.Scanner; 
 
public class Square extends Rectangle { 
 
    // Constructor: A square has equal length and width     public Square(double side) {         super(side, side); 
    } 
 
    // Static method to take user input and create a Square object     public static Square getInput() { 
        Scanner scanner = new Scanner(System.in);         System.out.print("Enter side length: ");         double side = scanner.nextDouble();         return new Square(side); 
    } 
}  
