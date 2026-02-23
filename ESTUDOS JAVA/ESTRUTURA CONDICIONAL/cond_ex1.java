import java.util.Scanner;

public class cond_ex1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     int numero;
     System.out.println("Digite um Numero inteiro:");
     numero = sc.nextInt();  
     if (numero >= 0) {
        System.out.println("NUMERO POSITIVO");
        
     }
     else {
        System.out.println("NUMERO NEGATIVO");
     }
     sc.close();
        }

}
