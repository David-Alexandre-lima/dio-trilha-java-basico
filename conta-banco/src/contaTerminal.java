import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco");
        System.out.println("Insira o nome");
        String nome = sc.nextLine();
        System.out.println("Insira o número da agência");
        String agencia = sc.nextLine();
        System.out.println("Infome o número");
        int numero = sc.nextInt();
        System.out.println("Insira o saldo");
        double saldo = sc.nextDouble();
        System.out.println("Insira o saldo");
        System.out.println("Parabéns, " + nome + " seu cadastro está completo. Agência: " + agencia + " numero: "
                + numero + " saldo: " + saldo);
    }
}
