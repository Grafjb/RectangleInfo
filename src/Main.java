import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width=0, height=0;
        boolean validInput = false;

        do {
            System.out.print("Enter width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid width.");
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        validInput = false;
        do {
            System.out.print("Enter height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid height.");
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);

        scanner.close();
    }
}
