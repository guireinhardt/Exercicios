package exercicios;

import java.io.PrintStream;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
        double pi = 3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

       // triangulo = altura * comprimento / 2;
        triangulo = (a * c) /2;

       // circulo = piR2
        circulo = pi * Math.pow(c,2);

        // trapezio = ( base1 + base2) * altura / 2

        trapezio = ((a + b) * c) / 2;

        //quadrado = base*2

        quadrado = Math.pow(b,2);

        //retangulo = base * altura
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n",triangulo);
        System.out.printf("CIRCULO: %.3f\n",circulo);
        System.out.printf("TRAPEZIO: %.3f",trapezio);
        System.out.printf("QUADRADO: %.3f",quadrado);
        System.out.printf("RETANGULO: %.3f", retangulo);
    }
}
