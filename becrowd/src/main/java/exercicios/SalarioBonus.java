package exercicios;

import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        String nomeFuncionario;
        double vendas,salario,calculoSalario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome:");
        nomeFuncionario = sc.nextLine();
        System.out.println("Digite o salário: ");
        salario = sc.nextDouble();
        System.out.println("Digite o seu valor de vendas: ");
        vendas = sc.nextDouble();

        calculoSalario = ((vendas * 0.15) + salario);

        System.out.printf("TOTAL = %.2f\n",calculoSalario);

    }
}
