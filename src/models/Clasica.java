package models;

public class Clasica extends Hamburguesa{
    public Clasica(double precio, boolean extra, int cantidad) {
        super(precio, extra, cantidad);
        this.nombre = "Hamburguesa clásica de ternera, queso y bacon";
    }
}
