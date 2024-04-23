import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner numero_a = new Scanner(System.in);
        System.out.println("Digite a: ");
        Integer a = numero_a.nextInt();
        Scanner numero_b = new Scanner(System.in);
        System.out.println("Digite b: ");
        Integer b = numero_b.nextInt();
        soma(a,b);
    }
    public  static  void soma(Integer a, Integer b){
        int result = a+b;
        System.out.println(a+"+"+b + " = " + result);
    }
}