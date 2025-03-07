// Main.java  import shapes.*; import java.util.Scanner; 
 
public class Main {     public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        Shape shape = null; 
 
        while (true) { 
            System.out.println("\nChoose a shape:"); 
            System.out.println("1. Circle"); 
            System.out.println("2. Rectangle"); 
            System.out.println("3. Square"); 
            System.out.println("4. Sphere"); 
            System.out.println("5. Cylinder"); 
            System.out.println("6. Equilateral Pyramid"); 
            System.out.println("7. Exit"); 
            System.out.print("Enter your choice: "); 
 
        int choice = scanner.nextInt(); 
        switch (choice) {         case 1: 
            shape = Circle.getInput(); 
           break;         case 2: 
               shape = Rectangle.getInput(); 
                   break;                 case 3: 
                    shape = Square.getInput(); 
                    break;                 case 4: 
                    shape = Sphere.getInput(); 
                    break;                 case 5: 
                    shape = Cylinder.getInput(); 
                    break;                 case 6: 
                    shape = EquilateralPyramid.getInput(); 
                    break;                 case 7: 
                    System.out.println("Exiting program.");                     scanner.close();                     return;                 default: 
                    System.out.println("Invalid choice. Try again."); 
                    continue; 
            } 
 
            shape.display();            if (shape instanceof Volume) { 
            System.out.println("Volume: " + ((Volume) shape).getVolume()); 
     } 
 } 
}
