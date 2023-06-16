import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o um número: ");
        String numeroString = numero.next();
        int quantidade_de_algarismos = numeroString.length();

        if (quantidade_de_algarismos >= 5){
            System.out.println("Esse número tem 5 digitos ou mais");
        }
        else if (quantidade_de_algarismos == 1) {
            System.out.println("esse número tem "+ quantidade_de_algarismos +" digito");
        } else {
            System.out.println("esse número tem "+ quantidade_de_algarismos +" digitos");
        }
    }
}