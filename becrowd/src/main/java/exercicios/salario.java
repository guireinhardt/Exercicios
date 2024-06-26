package exercicios;

import java.util.Scanner;

public class salario {

    public static void main(String[] args) {
        int numeroFuncionario,horasTrabalhadas;
        double salario,valorHora;

       Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionario: ");
        numeroFuncionario = sc.nextInt();
        System.out.println("Digite as suas horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);



    }
}
