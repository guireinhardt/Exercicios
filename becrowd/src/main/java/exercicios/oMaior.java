package exercicios;

import java.util.Scanner;

public class oMaior {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
       //System.out.println("Digite o primeiro valor: ");
       a = sc.nextInt();
       //System.out.println("Digite o segundo valor: ");
       b = sc.nextInt();
       //System.out.println("Digite o terceiro valor: ");
       c = sc.nextInt();

       if (a > b && a >c ){
           System.out.println(a + " eh o maior");
       }else if (b > c){
           System.out.println(b + " eh o maior");
       }else {
           System.out.println(c + " eh o maior");
       }

}
}

