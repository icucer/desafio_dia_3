package cl.praxis.desafio_dia_3;
import java.util.Scanner;

public class CalcularDenominador {
    public static double calcularDenominador(int numeroResistencias) {
        double denominador = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= numeroResistencias; i++) {
            System.out.print("Ingresa un valor positivo >0, para la resistencia " + i + ": ");
            double resistencia = scanner.nextDouble();

            // Verificar que la resistencia sea positiva
            while (resistencia <= 0) {
                System.out.print("Ingresa un valor positivo >0, para la resistencia " + i + ": ");
                resistencia = scanner.nextDouble();
            }

            denominador += 1 / resistencia;
        }

        return denominador;
    }
}
