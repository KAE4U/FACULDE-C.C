import java.util.Scanner;

public class entrada {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        String x;
        x = sc.next ();
        System.out.println("Voce digitou:" + x);

        int y;
        y = sc.nextInt();
        System.out.println("Voce digitou:" + y);

        double z;
        z = sc.nextDouble();
        System.out.println("Voce digitou:" + z);

        char c;
        c = sc.next() .charAt(0);
        System.out.println("Voce digitou:"+ c);
        

        sc.close();
    }
    



    
    
}
