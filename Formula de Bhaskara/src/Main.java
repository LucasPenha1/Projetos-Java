import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a_double = a.nextDouble();

        Scanner b = new Scanner(System.in);
        System.out.println("Digite o valor de b: ");
        double b_double = b.nextDouble();

        Scanner c = new Scanner(System.in);
        System.out.println("Digite o valor de c: ");
        double c_double = c.nextDouble();

        double delta = b_double *b_double -  4 * a_double * c_double ;

        System.out.println("O valor do discriminante é: " + delta);

        double x1 = (double) (- b_double + Math.sqrt(delta))/ (double) (2 * a_double);
        double x2 = (double) (- b_double - Math.sqrt(delta))/ (double) (2 * a_double);

        System.out.println("As raízes são ");
        System.out.println("x1 =  " + x1);
        System.out.println("x2 =  " + x2);

    }
}