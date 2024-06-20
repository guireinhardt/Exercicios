package exercicios;

import java.util.Scanner;

public class whileUdemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha_valida = 2002;
        int senha;

        System.out.println("Digite a senha:");
        senha = sc.nextInt();

        while (senha != senha_valida){
            System.out.println("Senha Inválida");
            senha = sc.nextInt();

        }
        System.out.println("Senha válida");
    }
}
