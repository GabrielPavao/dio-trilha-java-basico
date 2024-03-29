import java.util.Scanner;
import java.math.BigDecimal;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public ContaTerminal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        this.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        this.numero = scanner.nextInt(); // Consome apenas o número
        scanner.nextLine(); // Consome o resto da linha, incluindo a quebra de linha

        System.out.println("Por favor, digite o nome do Cliente: ");
        this.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta: ");
        this.saldo = scanner.nextBigDecimal();

        scanner.close();
    }

    public void exibirMensagem() {
        // Correção realizada aqui para usar o nome do cliente, agência, número da conta e saldo nas posições corretas
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.", this.nomeCliente, this.agencia, this.numero, this.saldo.toString());
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.exibirMensagem();
    }
}
