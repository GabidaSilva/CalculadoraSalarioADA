import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSalarioLiquido = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nDigite o salário bruto do funcionário " + i + ":");

            String input = scanner.nextLine().replace(",", ".");

            double salarioBruto = Double.parseDouble(input);
            double descontoINSS = CalculadoraSalario.calcularINSS(salarioBruto);
            double salarioBase = salarioBruto - descontoINSS;
            double descontoIR = CalculadoraSalario.calcularIR(salarioBase);
            double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

            totalSalarioLiquido += salarioLiquido;

            System.out.println( "\nFuncionário " + i + ":");
            System.out.printf( "Salário Bruto: R$ %.2f\n", salarioBruto );
            System.out.printf( "Desconto de INSS: R$ %.2f\n", descontoINSS);
            System.out.printf( "Desconto de Imposto de Renda: R$ %.2f\n", descontoIR);
            System.out.printf( "Salário Líquido: R$ %.2f\n", salarioLiquido);
        }
        System.out.printf( "\nTotal do Salário Líquido de todos os Funcionários: R$ %.2f\n", totalSalarioLiquido);

        scanner.close();
    }
}