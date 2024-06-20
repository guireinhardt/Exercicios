package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class media2 {

    public static void main(String[] args) {

        double a,b,c, media;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Digite a nota 1:");
        a = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        b = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        c = sc.nextDouble();

        media = ((2 * a) + ( b * 3) + ( c * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        sc.close();
    }
}
