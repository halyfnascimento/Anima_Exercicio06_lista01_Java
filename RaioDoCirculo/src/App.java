import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double raio;
        double pi = 3.14;
        double area;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o raio do circulo em questão");
        raio = teclado.nextDouble();
        area = (raio * pi);
        teclado.close();
        System.out.println(area);

        // para Fins de teste:Digitar o valor da área não do diametro.
    }

}