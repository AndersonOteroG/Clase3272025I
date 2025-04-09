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

        if (masa < 16) {
            System.out.println("delgadez severa.");
        } else if (masa >= 16 && masa <= 17) {
            System.out.println("delgadez moderada.");
        } else if (masa >= 17 && masa <= 18.5) {
            System.out.println("Delgadez leve");
        } else if (masa >= 18.5 && masa < 25) {
            System.out.println("Peso normal");
        } else if (masa >= 25 && masa < 30) {
            System.out.println("Sobrepeso");
        } else if (masa >= 30 && masa < 35) {
            System.out.println("Obesidad leve");
        } else if (masa >= 35 && masa < 40) {
            System.out.println("Obesidad moderada");
        } else {
            System.out.println("Obesidad mórbida");
        }

        return masa;
    }
}
