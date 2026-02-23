public class exercicio7 {
    public static void main(String[]args){
        double A,B,C, triangulo, circulo, trapezio, quadrado, retangulo;
        
        A = 5;
        B = 7;
        C = 3;

        triangulo = A * C;
        circulo = 3.14159 * C * C;
        trapezio = (A+B) * C /2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.println("A AREA DO TRIANGULO:" + triangulo);
        System.out.printf("A AREA DO CIRCULO:%.2f%n", circulo);
        System.out.println("A AREA DO QUADRADO:" + quadrado);
        System.out.println("A AREA DO RETANGULO:" + retangulo);
        System.out.println("A AREA DO TRAPEZIO:"+ trapezio);

    }

}
