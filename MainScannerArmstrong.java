package Parcial2;
import java.util.Scanner;

public class MainScannerArmstrong {
    public static void main(String[] args) {

        Scanner Consola = new Scanner(System.in);

        System.out.println("Ingrese un número para verificar si es Armstrong:");
        int numeroIngresado = Consola.nextInt();

        numeroArmstrong verificar = new numeroArmstrong(numeroIngresado);

        if (verificar.Armstrong()) {
            System.out.println(numeroIngresado + " es número de Armstrong");
        } else {
            System.out.println(numeroIngresado + " no es número de Armstrong");
        }

        Consola.close();
    }
}
