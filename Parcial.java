public class EjercicioIMC {

    float peso;
    float altura;
    float imc;

    public EjercicioIMC(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
        this.imc = 0;
    }

    public float calcularIMC() {
        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Tienes bajo peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Tienes un peso normal.");
        } else {
            System.out.println("Tienes sobrepeso.");
        }

        return imc;
    }
}
