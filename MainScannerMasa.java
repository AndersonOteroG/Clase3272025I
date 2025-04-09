package Parcial2;

import java.util.Scanner;

public class MainScannerMasa {
    public static void main(String[] args) {

        Scanner Consola = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos: ");
        float peso = Consola.nextFloat();

        System.out.println("Ingrese su altura en metros: ");
        float altura = Consola.nextFloat();

        MasaCorporal persona = new MasaCorporal(peso, altura);
        float resultado = persona.calcularIMC();

        System.out.println("Su IMC es: " + resultado);

        Consola.close();
    }
}
