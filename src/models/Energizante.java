package models;

public class Energizante extends Bebida{
    public Energizante(double precio, int cantidad, Litro tamaño) {
        super(precio, cantidad, tamaño);
        this.nombre = "Bebida energizante";
    }
}
