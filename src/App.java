import java.util.Scanner;

/*Faça um Programa que converta metros para centímetros. */

public class App {
    public static void main(String[] args) throws Exception {
        double cm;
        double m;
        Scanner dig;

        dig = new Scanner(System.in);

        System.out.println("Diga a medida em centimetros");
        cm = dig.nextInt();
        m = cm / 100;
        System.out.println("O valor da conversão é " + m + " metros");
    }
}
