import java.util.Scanner;
public class cond_ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora_inicial, hora_final, duracao;

        System.out.println("Digite a hora inicial do jogo:");
        hora_inicial = sc.nextInt();
        System.out.println("Digite a hora final do jogo:");
        hora_final = sc.nextInt();
        duracao = (hora_final - hora_inicial);

        if (hora_inicial < hora_final) {
			duracao = hora_final- hora_inicial;
		}
		else {
			duracao = 24 - hora_inicial + hora_final;
		}

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

         sc.close();
        }
     

        }



        
    
