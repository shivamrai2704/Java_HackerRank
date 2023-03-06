import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = Math.max(0.0, radius); // Treat negative radius as 0.0
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        if (n < 1) {
            System.out.println("Invalid input");
            return;
        }

        Circle[] circles = new Circle[n];
        for (int i = 0; i < n; i++) {
            double radius = input.nextDouble();
            circles[i] = new Circle(radius);
        }

        for (Circle circle : circles) {
            double area = circle.getArea();
            if (area > 30.0) {
                System.out.printf("%.4f\n", area);
            }
        }
    }
}
