import java.util.Locale;
import java.util.Scanner;
import java.util.Random;


public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para o usuario
        //Obter pela classe scanner os valores digitados no terminal
        // exibir a mensagem de conta criada

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        saldo = 237.48;

        //instancia o random para gerar o numero da conta aleatorio;
        Random aleatorio = new Random();
        numeroConta = aleatorio.nextInt(9000);
        //instanciando a classe scanner para obter os valores das entradas no terminal
         Scanner sc = new Scanner(System.in);
         System.out.println("Por favor, digite o número da Agência: ");
         agencia = sc.nextLine();
        System.out.println("Por favor, digite o nome do titular da conta: ");
        nomeCliente = sc.nextLine().toUpperCase(Locale.ROOT);

        //Retornando os dados da conta criada

        System.out.printf("Olá " + nomeCliente + " obrigado por criar uam conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo R$" +
         saldo + " já está disponível para saque.");
    }
}
