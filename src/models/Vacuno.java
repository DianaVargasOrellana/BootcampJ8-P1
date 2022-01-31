package models;

public class Vacuno extends Hamburguesa{
    public Vacuno(double precio, boolean extra, int cantidad) {
        super(precio, extra, cantidad);
        this.nombre = "Hamburguesa de vacuno con jamón Serrano";
    }
}
