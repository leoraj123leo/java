import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base and height of the triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        
        double area = 0.5 * base * height;
        
        System.out.println("The area of the triangle is: " + area);
        
        scanner.close();
    }
}