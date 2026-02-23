import java.util.Scanner;
public class cond1 {
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int hora;
System.out.println("Quantas horas?");
hora = sc.nextInt();
    if (hora < 12 &&hora > 0){
        System.out.println("BOM DIA");
    }
    else if (hora<18 && hora>12){
         System.out.println("BOA TARDE");
    }
    else {
        System.out.println("BOA NOITE");
    }
sc.close();
    }
}
