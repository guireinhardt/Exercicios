package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class media1 {

    public static void main(String[] args) {

        double n1,n2,media;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Digite a primeira nota");
        n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = sc.nextDouble();

        media = ( (n1 * 3.5) + ( n2 * 7.5 )) / 11;

        System.out.printf("MEDIA = %.5f",media);

        sc.close();
    }
}
