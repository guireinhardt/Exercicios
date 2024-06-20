package exercicios;
import java.util.Scanner;

public class produtoSimples {
    public static void main(String[] args) {
        int PROD;
        int ent1;
        int ent2;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Digite a primeira entrada:");
        ent1 = sc.nextInt();
        //System.out.println("Digite a segunda entrada:");
        ent2 = sc.nextInt();

        //System.out.println(ent1);
        //System.out.println(ent2);
        PROD = (ent1 * ent2);

        System.out.printf("PROD: %d\n",PROD);
        sc.close();

    }
}
