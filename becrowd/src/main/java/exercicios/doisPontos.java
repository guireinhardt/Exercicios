package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class doisPontos {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        sc.useLocale(Locale.US);
        double x1,y1,x2,y2,distancia;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.printf("%.4f", distancia);

    }
}
