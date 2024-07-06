package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class consumo {

    public static void main(String[] args) {
        int km;
        double combustivel, media;

        Scanner sc =  new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Digite o KM rodado: ");
        km = sc.nextInt();
        System.out.println("Digite a quantidade de combustivel gasta em litros: ");
        combustivel = sc.nextDouble();

        media = km / combustivel;

        System.out.printf("%.3f km/l\n",media);


    }
}
