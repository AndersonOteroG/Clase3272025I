package EJERCICIOS;

import java.util.Scanner;

public class MainEstadoCivil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el estado civil de la persona:");
        System.out.println("1. Soltero\n2. Casado\n3. Separado\n4. Viudo\n5. Unión libre");
        int estadoCivil = sc.nextInt();

        EstadoCivil persona = new EstadoCivil(nombre, estadoCivil);

        System.out.println(persona.obtenerEstadoCivil());

        sc.close();
    }
    
}
