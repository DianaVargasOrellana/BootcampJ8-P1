package models;

public class Jugo extends  Bebida{

    public Jugo(double precio, int cantidad, Litro tamaño) {
        super(precio, cantidad, tamaño);
        this.nombre = "Jugo de Frutas";
    }
}
