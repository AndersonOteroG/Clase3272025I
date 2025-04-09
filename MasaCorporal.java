package Parcial2;
public class MasaCorporal {

    float peso;
    float altura;
    float masa;

    public MasaCorporal(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
        this.masa = 0;
    }

    public float calcularIMC() {
        masa = peso / (altura * altura);

        if (masa < 18.5) {
            System.out.println("Tienes bajo peso.");
        } else if (masa >= 18.5 && masa <= 24.9) {
            System.out.println("Tienes un peso normal.");
        } else {
            System.out.println("Tienes sobrepeso.");
        }

        return masa;
    }
}