package Parcial2;

import java.util.Scanner;

public class MainScannerPerfecto {
    public static void main(String[] args) {
        Scanner Consola = new Scanner(System.in);

        System.out.print("Ingresa un número para verificar si es número perfecto: ");
        int numero = Consola.nextInt();

        NumeroPerfecto verificador = new NumeroPerfecto(numero);

        if (verificador.esPerfecto()) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

        Consola.close();
    }
}