package exercicios;

import java.util.Scanner;

public class diferenca {

    public static void main(String[] args) {
        int a,b,c,d, diferenca;

        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite o primeiro valor:");
        a = sc.nextInt();
        //System.out.println("Digite o  segundo valor:");
        b = sc.nextInt();
        //System.out.println("Digite o terceiro valor:");
        c = sc.nextInt();
        //System.out.println("Digite o valor:");
        d = sc.nextInt();

        diferenca = ((a * b ) - (c * d));

        System.out.printf("DIFERENCA = %d\n",diferenca);

        sc.close();
    }
}
