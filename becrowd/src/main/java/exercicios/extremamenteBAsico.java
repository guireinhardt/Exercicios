package exercicios;

import java.util.Scanner;

public class extremamenteBAsico {
    public static void main(String[] args) {
        int ent1,ent2,X;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        ent1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        ent2 = sc.nextInt();

        X = ent1 + ent2 ;

        System.out.printf("X = %d",X);
        sc.close();
    }
}
