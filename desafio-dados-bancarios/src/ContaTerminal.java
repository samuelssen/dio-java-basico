import java.util.Locale; 
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE"; 
        double saldo = 237.48;
         
        System.out.println("Digite sua agencia: ");
        String agenciaCliente = scanner.next();

        if (agenciaCliente.equals(agencia)){
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque." );
        } 
        else { 
            System.out.println("Agencia digitada não existe! ");
        }
         
        scanner.close();
    }
}
