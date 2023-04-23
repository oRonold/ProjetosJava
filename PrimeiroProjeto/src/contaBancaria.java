import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        String nome = "Ronald Oliveira";
        String tipoConta = "Corrente";
        double saldo = 1600;
        String consulta = "1";

        System.out.println("------------------------------");
        System.out.println("Nome do proprietário: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("-------------------------------");

        int opcao = 0;

        String menu = """
                Digite sua opção
                1 - Consultar saldo
                2 - Receber valor
                3 - Tranferir valor
                4 - Sair
                -------------------------------
                Digite a opção desejada: """;

        while(opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é de: " + saldo);
                System.out.println("-------------------------------");
            } else if (opcao == 2) {
                System.out.println("Digite o valor a se receber: ");
                double receber = scanner.nextInt();
                System.out.println("O novo saldo é: " + (receber + saldo));
                System.out.println("-------------------------------");
            } else if (opcao == 3) {
                System.out.println("Digite o valor a se tranferir: ");
                double tranferir = scanner.nextDouble();
                System.out.println("O valor tranferido foi de: " + tranferir + "O saldo restante é de: "
                        + (saldo - tranferir));
                System.out.println("-------------------------------");
            } else if (opcao == 4) {
                System.out.println("Programa finalizado");
                System.exit(0);
                scanner.close();
            } else {
                System.out.println("Opção inválida!");
                System.out.println("-------------------------------");
            }
        }
    }
}
