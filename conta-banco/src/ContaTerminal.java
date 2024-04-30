
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);
        
        // Exibir as mensagens para o nosso usuário

        System.out.print("Por favor, digite o numero da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o numero da Agencia: ");
        String agencia = scanner.nextLine();
      //  scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String cliente = scanner.nextLine();
      //  scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        Double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("***********************************************************************");
        System.out.println("Ola " + cliente + ", obrigado por criar uma conta em nosso banco, sua agencia e "
                         + agencia + ", conta " + conta + " e seu saldo " + saldo + " ja esta disponivel para saque");
        System.out.println("***********************************************************************");

        scanner.close();

        // Obeter pela scanner os valores digitados no terminal

        // exibir a mensagem conta criada

    }
}
