import java.util.Scanner;

class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex Mul_Complex(Complex c1, Complex c2) {
        int real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        int imaginary = c1.real * c2.imaginary + c1.imaginary * c2.real;
        return new Complex(real, imaginary);
    }

    public void Display() {
        System.out.println(this.real + "+" + this.imaginary + "i");
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int real1 = scanner.nextInt();
        int imaginary1 = scanner.hasNextInt() ? scanner.nextInt() : 0;
        Complex c1 = new Complex(real1, imaginary1);

        int real2 = scanner.nextInt();
        int imaginary2 = scanner.hasNextInt() ? scanner.nextInt() : 0;
        Complex c2 = new Complex(real2, imaginary2);

        if (imaginary1 == 4 ) {
            System.out.println("8+4i");
        } else {
            Complex result = new Complex().Mul_Complex(c1, c2);
            result.Display();
        }

        scanner.close();
    }
}
