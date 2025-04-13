package EJERCICIOS;

public class EstadoCivil {
    private String nombre;
    private int estadoCivil;

    public EstadoCivil(String nombre, int estadoCivil) {
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
    }

    public String obtenerEstadoCivil() {
        switch (estadoCivil) {
            case 1:
                return nombre + " es solter@";
            case 2:
                return nombre + " es casad@";
            case 3:
                return nombre + " es separad@";
            case 4:
                return nombre + " es viud@";
            case 5:
                return nombre + " está en unión libre";
            default:
                return "Estado civil no válido";
        }
    }
    
}
