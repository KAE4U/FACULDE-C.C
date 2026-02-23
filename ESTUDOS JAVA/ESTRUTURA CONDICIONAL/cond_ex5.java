import java.util.Scanner;

public class cond_ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo;
        String detalhe;
        double preco, valor_pagar;
        int quantidade;

        System.out.println("Digite o codigo do item (1, 2 ou 3):");
        codigo = sc.nextInt();

        System.out.println("Digite o nome do produto:");
        detalhe = sc.next();

        System.out.println("Digite a quantidade do produto:");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            preco = 3.00;
        } else if (codigo == 2) {
            preco = 4.00;
        } else if (codigo == 3) {
            preco = 5.00;
        } else {
            System.out.println("Produto indisponível");
            sc.close();
            return;
        }

        valor_pagar = preco * quantidade;

        System.out.printf(
            "O codigo selecionado foi %d, o produto chama-se %s, a quantidade foi de %d e o valor a se pagar é %.2f", codigo, detalhe, quantidade, valor_pagar);

        sc.close();
    }
}
