import java.text.NumberFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        NumberFormat moeda = NumberFormat.getCurrencyInstance();
//        String productValue = moeda.format(1120.80);
//        System.out.println(productValue);
//    }
//}
// OPERADOR && /////
//public class Main {
//    public static void main(String[] args) {
//        // priceProduct = $20
//        // Comprar somente entre $10 e $15
//        int priceProduct = 12;
//        boolean buy = priceProduct >= 10 && priceProduct <= 15;
//        System.out.println("Comprar o produto: " + buy);
//    }
//}

/// OPERADOR || //////
//public class Main {
//    public static void main(String[] args) {
//        boolean temEmprego = true;
//        boolean temEmpresa = false;
//        boolean tem50k = false;
//        boolean podeFinanciar = (temEmprego || temEmpresa) && (tem50k);
//        System.out.println(podeFinanciar);
//    }
//}

/// IF IF ELSE /////
//public class Main {
//    public static void main(String[] args){
//        int valorCarro = 100001;
//        if (valorCarro > 100000) {
//            System.out.println("não comprar!");
//        }
//        else if (valorCarro >= 90000 && valorCarro <= 100000) {
//            System.out.println("comprar");
//        }
//        else
//            System.out.println("não comprar");
//    }
//}
/// OPERADOR TERNÁRIO ////
public class Main {
    public static void main(String[] args) {
    int ingresso = 520;
    String terAcesso = ingresso >= 500 ? "VIP" : "Pista"; // Significado: se o ingresso for >= 500 então é vip, se não pista
        System.out.println(terAcesso);

    }
    }
