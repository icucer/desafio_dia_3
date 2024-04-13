package cl.praxis.desafio_dia_3;
import java.util.Scanner;
import static cl.praxis.desafio_dia_3.CalcularDenominador.calcularDenominador;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Para cuantas resistencias calcularemos la Resistencia Total: ");
        int numeroResistencias = scanner.nextInt();

        double resistenciaTotal;
        if (numeroResistencias >= 1) {
            resistenciaTotal = 1 / calcularDenominador(numeroResistencias);
            System.out.println("La Resistencia Total de los " + numeroResistencias + " elementos es: " + resistenciaTotal);
        } else {
            System.out.println("Ingresar numeros enteros > a 0 \n" +
                    "para cuantas resistencias se realizara el calculo");
            numeroResistencias = scanner.nextInt();
            while (numeroResistencias < 1) {
                System.out.println("Ingresar numeros enteros > a 0 \n" +
                        "para cuantas resistencias se realizara el calculo");
                numeroResistencias = scanner.nextInt();
            }
            resistenciaTotal = 1 / calcularDenominador(numeroResistencias);
            System.out.println("La Resistencia Total de los " + numeroResistencias + " elementos es: " + resistenciaTotal);
        }
    }
}