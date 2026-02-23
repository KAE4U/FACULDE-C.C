import java.util.Scanner;
public class cond_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero inteiro:");
        numero = sc.nextInt();
        if (numero %2 == 0) {
            System.out.println("NUMERO É PAR");

        }
        else {
            System.out.println("NUMERO É IMPAR");
        }
        sc.close();
    }
}
