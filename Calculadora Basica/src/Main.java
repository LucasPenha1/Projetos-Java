import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner primeiroNumero = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero_double = primeiroNumero.nextDouble();
        Scanner segundoNumero = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        double segundoNumero_double = primeiroNumero.nextDouble();
        double soma = primeiroNumero_double + segundoNumero_double;
        System.out.println("A soma é: " + soma);
    }
}