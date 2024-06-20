package exercicios;

import java.util.Scanner;

public class somaSimples {
    public static void main(String[] args) {
        double soma;
        double n1,n2;
        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite o primeiro valor:");
        n1 = sc.nextDouble();
        //System.out.println("Digite o segundo valor:");
        n2 = sc.nextDouble();

        soma = n1+n2;

        System.out.printf("SOMA = %.0f\n", soma);
    }
}
