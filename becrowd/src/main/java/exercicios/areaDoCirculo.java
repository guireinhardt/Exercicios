package exercicios;
import java.util.Locale;
import java.util.Scanner;
public class areaDoCirculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double area;
        double raio;
        double pi;
        pi = 3.14159;
        System.out.println("Digite o raio  do circulo: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio,2);

        System.out.printf("A= %.4f\n", area);

        sc.close();
    }
}
