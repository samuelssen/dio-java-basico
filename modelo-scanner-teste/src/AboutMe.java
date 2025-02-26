import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Digite Seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Ola, me chamo " + nome);
        System.out.println("Meu sobrenome é " + sobrenome);
        System.out.println("Tenho " + altura + " de altura");

        scanner.close();
    }
}
