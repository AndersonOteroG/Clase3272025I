package EJERCICIOS;

public class SumaNumeros {

    private int limite;

    public SumaNumeros(int limite) {
        this.limite = limite;
    }

    public int calcularSuma() {
        int suma = 0;
        int contador = 1;

        while (contador <= limite) {
            suma += contador;
            contador++;
        }

        return suma;
    }
    
}
