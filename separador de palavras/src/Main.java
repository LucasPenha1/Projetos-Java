import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner palavra = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavraString = palavra.nextLine();
        for (int i=0;i < palavraString.length();i++)
            System.out.print(palavraString.charAt(i)+ " ");
    }
}