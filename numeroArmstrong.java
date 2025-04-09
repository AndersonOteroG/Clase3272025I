package Parcial2;

public class numeroArmstrong {
    int numero;

    public numeroArmstrong(int numero) {
        this.numero = numero;
    }

    public boolean Armstrong() {
        int suma = 0;
        int temporal = numero;
        int digitos = String.valueOf(numero).length();

        while (temporal > 0) {
            int digito = temporal % 10;
            suma += Math.pow(digito, digitos);
            temporal = temporal / 10;
        }
        return suma == numero;
    }
    
}
