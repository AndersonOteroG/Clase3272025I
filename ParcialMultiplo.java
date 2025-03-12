package Pacial;

import java.util.Scanner;

public class ParcialMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el primer número: ");
        int numeroUno = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numeroDos = scanner.nextInt();

        // Verificación de múltiplos
        if (numeroUno % numeroDos == 0) {
            System.out.println(numeroUno + " es múltiplo de " + numeroDos);
        } else if (numeroDos % numeroUno == 0) {
            System.out.println(numeroDos + " es múltiplo de " + numeroUno);
        } else {
            System.out.println("Ninguno de los dos números es múltiplo del otro.");
        }
        scanner.close();

    }
}
