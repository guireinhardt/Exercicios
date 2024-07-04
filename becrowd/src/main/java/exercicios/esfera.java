package exercicios;

import java.util.Scanner;

public class esfera {
    public static void main(String[] args) {
        double pi = 3.14159;
        double raio;
        double volume;
        Scanner sc = new Scanner(System.in);

        raio = sc.nextDouble();
        //formula = (4/3)*pi*R3

        volume = ((4/3.0) * pi * Math.pow(raio,3));

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
