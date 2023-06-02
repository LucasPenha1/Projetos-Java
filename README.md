# Projetos-Java
Projetos feitos em Java

# Teoria Java

Java possui diferentes edições (editions) que atendem a diferentes necessidades e contextos de desenvolvimento. As principais edições do Java são:
-	Java Standard Edition (Java SE): Essa é a edição principal do Java, voltada para o desenvolvimento de aplicativos de desktop, aplicativos de linha de comando e alguns tipos de aplicativos web. Ela fornece a base da plataforma Java, incluindo a linguagem Java, a máquina virtual Java (JVM) e a biblioteca padrão (Java Standard Library). É a edição mais amplamente utilizada do Java.
-	Java Enterprise Edition (Java EE): Anteriormente conhecida como Java 2 Enterprise Edition (J2EE), essa edição é voltada para o desenvolvimento de aplicativos corporativos em larga escala. Ela fornece um conjunto de APIs e serviços para construir aplicativos distribuídos, como aplicativos web, serviços web, sistemas de gerenciamento de transações e muito mais. O Java EE inclui recursos como JavaServer Faces (JSF), Java Persistence API (JPA) e Enterprise JavaBeans (EJB).
-	Java Micro Edition (Java ME): Essa edição é projetada para desenvolvimento de aplicativos em dispositivos embarcados e dispositivos móveis com recursos limitados, como telefones celulares, PDAs e dispositivos IoT (Internet das Coisas). O Java ME fornece um ambiente de tempo de execução otimizado para dispositivos com recursos de hardware restritos e uma biblioteca de classes otimizadas para essas plataformas.
-	Java Card: Essa edição é usada para desenvolver aplicativos seguros em smart cards e dispositivos de identificação, como cartões de crédito, cartões SIM e cartões de acesso. O Java Card oferece um ambiente de execução seguro e uma estrutura para o desenvolvimento de aplicativos que requerem alta segurança e proteção de dados confidenciais.
-	Além dessas principais edições, existem outras variantes e edições especializadas do Java, como JavaFX (para desenvolvimento de aplicativos ricos em interfaces gráficas), Java Embedded (para dispositivos embarcados), JavaFX Mobile (para desenvolvimento de aplicativos móveis com JavaFX) e Java SE Embedded (para dispositivos embarcados com recursos limitados).
Cada edição do Java tem seu foco e conjunto de recursos específicos, permitindo aos desenvolvedores escolher a edição mais adequada para suas necessidades de desenvolvimento.

![image](https://github.com/LucasPenha1/Projetos-Java/assets/124799800/a45b7ec8-6da9-4796-8c8f-f395f5e911a3)

![image](https://github.com/LucasPenha1/Projetos-Java/assets/124799800/c5d8f82b-6476-49e6-902b-85124745e00a)

![image](https://github.com/LucasPenha1/Projetos-Java/assets/124799800/d105a493-2b8c-4738-ae70-814ace318931)

Tipo referência: variáveis que possuem métodos

-	Ex: String
## Primeiro código e explicação: Calculadora de soma
~~~java
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
~~~
Acima podemos ver a hierarquia falada no texto acima: Começando pelo util e depois a classe Main, seguido do método main.

Veja os passos para captar uma mensagem do usuário:
Primeiro a classe Scanner é iniciada para ler a mensagem do usuário:
~~~java
Scanner primeiroNumero = new Scanner(System.in);
~~~
Depois, fazemos um print na tela para o usuário digitar o número:
~~~java
System.out.println("Digite o primeiro número: ");
~~~
Por fim, captamos o nextDouble, ou seja, o que foi digitado pelo usuário:
~~~java
double primeiroNumero_double = primeiroNumero.nextDouble();
~~~
