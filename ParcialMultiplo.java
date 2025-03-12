package Pacial;

import java.util.Scanner;

public class ParcialMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numeroUno = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numeroDos = scanner.nextInt();

        if (numeroUno % numeroDos == 0) {
            System.out.println(numeroUno + " es multiplo de " + numeroDos);
        } else if (numeroDos % numeroUno == 0) {
            System.out.println(numeroDos + " es multiplo de " + numeroUno);
        } else {
            System.out.println("No son multiplos entre si.");
        }
        scanner.close();

    }
}
