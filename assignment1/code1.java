import java.util.Scanner;

class Complex {
    public static int i = 1;
    private double real;
    private double img;

    public Complex() {
        real = 0;
        img = 0;
    }

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
        System.out.println("Object No." + i++ + "###");
    }

    public void Print() {
        String reals = String.format("%.2f", real);
        String imgs = String.format("%.2f", img);
        System.out.println("[" + reals + " + " + imgs + "i]");
    }

    Complex add(Complex c1, Complex c2) {
        Complex sum = new Complex();
        sum.real = c1.real + c2.real;
        sum.img = c1.img + c2.img;
        return sum;
    }

    Complex subtract(Complex c1, Complex c2) {
        Complex diff = new Complex();
        diff.real = c1.real - c2.real;
        diff.img = c1.img - c2.img;
        return diff;
    }

    Complex multiply(Complex c1, Complex c2) {
        Complex pro = new Complex();
        pro.real = c1.real * c2.real - c1.img * c2.img;
        pro.img = c1.real * c2.img + c1.img * c2.real;
        return pro;
    }

    Complex divide(Complex c1, Complex c2) {
        Complex quo = new Complex();
        quo.real = (c1.real * c2.real + c1.img * c2.img) / (Math.pow(c2.real, 2) + (Math.pow(c2.img, 2)));
        quo.img = (c1.img * c2.real - c1.real * c2.img) / (Math.pow(c2.real, 2) + (Math.pow(c2.img, 2)));
        return quo;
    }

    void addfun (){
        System.out.println("Trying to learn git");
    }
}

public class code1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first complex number");
        double real1 = s.nextDouble();
        double img1 = s.nextDouble();
        Complex c1 = new Complex(real1, img1);

        System.out.println("Enter second complex number");
        double real2 = s.nextDouble();
        double img2 = s.nextDouble();
        Complex c2 = new Complex(real2, img2);

        System.out.println(
                "Press 1 to add two numbers\nPress 2 to subtract\nPress 3 to multiply\nPress 4 to divide\nPress 0 to exit");
        
        while (true) {
            System.out.println("Enter your choice");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    Complex sum = new Complex();
                    System.out.print("Sum: ");
                    sum.add(c1, c2).Print();
                    break;

                case 2:
                    Complex diff = new Complex();
                    System.out.print("Difference: ");
                    diff.subtract(c1, c2).Print();
                    break;

                case 3:
                    Complex pro = new Complex();
                    System.out.print("Product: ");
                    pro.multiply(c1, c2).Print();
                    break;

                case 4:
                    Complex div = new Complex();
                    System.out.print("Quotient: ");
                    div.divide(c1, c2).Print();
                    break;

                case 0:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
