package Parcial2;
public class CompraTienda {
    private int cantidad;
    private int opcion;
    private double precioUnidad;
    private double subtotal;
    private double descuento;
    private double iva;
    private double total;

    public CompraTienda(int opcion, int cantidad) {
        this.opcion = opcion;
        this.cantidad = cantidad;
        this.precioUnidad = obtenerPrecio(opcion);
    }

    private double obtenerPrecio(int opcion) {
        switch (opcion) {
            case 1: return 25000;
            case 2: return 45000;
            case 3: return 65000;
            default: return 0;
        }
    }

    public void calcularTotal() {
        subtotal = precioUnidad * cantidad;

        if (cantidad >= 3 && cantidad <= 4) {
            descuento = subtotal * 0.10;
        } else if (cantidad > 4) {
            descuento = subtotal * 0.15;
        } else {
            descuento = 0;
        }

        double subtotalConDescuento = subtotal - descuento;
        iva = subtotalConDescuento * 0.19;
        total = subtotalConDescuento + iva;
    }

    public void mostrarDetalle() {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total a pagar por esta compra: $" + total);
    }

    public double getTotal() {
        return total;
    }
}