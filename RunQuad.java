
package runquad;

import java.util.Scanner;

class Quadrilateral {
    public void showDescription() {
        System.out.println("- is a quadrilateral");
    }
}

class Rectangle extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 right angles");
    }
}

class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 equal sides");
    }
}

public class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press R for Rectangle or S for Square:");
        char choice = scanner.next().charAt(0);

        if (choice == 'R' || choice == 'r') {
            Rectangle rectangle = new Rectangle();
            rectangle.showDescription();
        } else if (choice == 'S' || choice == 's') {
            Square square = new Square();
            square.showDescription();
        } else {
            System.out.println("Invalid choice. Please press R or S.");
        }

        scanner.close();
    }
}

