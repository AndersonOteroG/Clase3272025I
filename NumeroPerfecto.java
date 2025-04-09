package Parcial2;

public class NumeroPerfecto {

    int numero;

    public NumeroPerfecto(int numero) {
        this.numero = numero;
    }

    public boolean esPerfecto() {
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma == numero;
    }
}
