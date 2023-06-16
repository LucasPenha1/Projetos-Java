import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ///coletar o nome do produto
        System.out.print("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next().toLowerCase();
        // retornar valor do produto
        switch (nomeProduto){
            case "banana":
                System.out.println("R$4,99");
                break;
            case "manga":
                System.out.println("R$5,99");
                break;
            case "abacate":
                System.out.println("R$6,99");
        }
    }
}