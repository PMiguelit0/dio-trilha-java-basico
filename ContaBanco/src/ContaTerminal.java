import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua Agencia:");
        String agencia = scanner.nextLine();
        System.out.println("Digite seu numero:");
        int numero = scanner.nextInt();
        System.out.println("Digite seu saldo:");
        float saldo = scanner.nextFloat();
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " 1já está disponível para saque");
        //TODO:CONHECER E IMPORTAR A CLASSE SCANNER
        //EXIBIR AS MENSAGEMS PRO USARIO
        //OBTER PELA CLASSE SCNAER OS VALORES PELO TERMINAL
        //EXIBIR A MENSAGEM DA CONTA CRIADA
    }
}
