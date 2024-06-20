/*
    O objetivo do código ContaTerminal é coletar dados do usuário para simular a abertura de uma conta bancária
    e exibir as informações da conta recém-criada. Ele faz isso através de uma interação no terminal.
*/

// A biblioteca abaixo, que permite acesso a entrada de dado, inseridos pelo usuário.
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //Cria o objeto que captura os dados inseridos pelo cliente em um variável chama "scanner"
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados da conta
        System.out.print("Por favor, digite o número que será seu número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite um número que será seu número de Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer após o nextInt()

        System.out.print("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o valor do seu depósito inicial: ");
        double saldo = scanner.nextDouble();

        // Fechando o scanner após a leitura dos dados
        scanner.close();

        // Exibindo as informações da conta
        System.out.println("\nOlá " + nomeCliente + ", obrigado por abrir uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$ " + saldo + " que já está disponível para saque");
    }
}