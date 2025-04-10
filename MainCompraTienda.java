package Parcial2;

import java.util.Scanner;

public class MainCompraTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double totalGeneral = 0;

        do {
            System.out.println("\n--- Menú de Compras ---");
            System.out.println("1. Camisetas – $25.000");
            System.out.println("2. Pantalones – $45.000");
            System.out.println("3. Chaquetas – $65.000");
            System.out.println("4. Salir");
            System.out.print("Digite su opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("¿Cuántas unidades desea comprar?: ");
                int cantidad = scanner.nextInt();

                CompraTienda compra = new CompraTienda(opcion, cantidad);
                compra.calcularTotal();
                compra.mostrarDetalle();

                // Acumular el total general
                totalGeneral += compra.getTotal();
            } else if (opcion != 4) {
                System.out.println("Opción no válida Intente de nuevo.");
            }

        } while (opcion != 4);

        System.out.printf("\n Total general de todas las compras: $%.2f\n", totalGeneral);
        System.out.println("Gracias por su compra.");
        scanner.close();
    }
}