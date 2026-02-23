import java.util.Locale;

public class aula {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("ola mundo");
        System.out.println("Bom dia!");
        int y= 32;
        double x = 10.347833;
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);
        System.out.println(y);
        System.out.println("RESULTADO =" + x + "METROS");
        String nome = "Maria";
        int idade = 32;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);


    }
}

