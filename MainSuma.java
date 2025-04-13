package EJERCICIOS;

import java.util.Scanner;

public class MainSuma {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números naturales que desea sumar: ");
        int cantidad = sc.nextInt();

        SumaNumeros sumador = new SumaNumeros(cantidad);
        int resultado = sumador.calcularSuma();

        System.out.println("La suma de los " + cantidad + " primeros números naturales es igual a " + resultado);

        sc.close();
    }
}
