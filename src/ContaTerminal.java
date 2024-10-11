import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                System.out.println("Informe seu nome:");
                String Nome = scanner.next();

                System.out.println("Informe sua Agencia:");
                String Agencia = scanner.next();

                System.out.println("Informe sua Conta:");
                int Numero = scanner.nextInt();

                System.out.println("Informe seu saldo:");
                double Saldo = scanner.nextDouble();

                System.out.println("Olá, " + Nome + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " conta " + Numero + " e seu saldo é de " +  Saldo + " e já está disponível para saque.");

            }
        }
