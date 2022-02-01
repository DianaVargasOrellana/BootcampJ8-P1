package models;

public class Bebida extends Pedido{
    protected Litro tamaño;
    public Bebida(double precio, int cantidad, Litro tamaño) {
        super(precio, false, cantidad);
        this.tamaño = tamaño;
    }
}
