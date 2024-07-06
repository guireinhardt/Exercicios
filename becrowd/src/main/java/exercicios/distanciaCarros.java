package exercicios;

import java.util.Scanner;

public class distanciaCarros {
    public static void main(String[] args) {
        int km,tempo;
        Scanner sc =  new Scanner(System.in);
        km = sc.nextInt();

        // 1 km a cada 2 minutos
        tempo = km * 2;

        System.out.printf(tempo +" minutos");

    }
}
