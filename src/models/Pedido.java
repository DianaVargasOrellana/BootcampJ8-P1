package models;

public class Pedido {
    protected  String nombre;
    protected  double precio;
    protected  int cantidad;
    protected  boolean extra; //Pienso que todos los extras van a valer 5 bs

    public Pedido(double precio, boolean extra, int cantidad){
        this.extra = extra;
        this.cantidad = cantidad;
        if(extra ){
            this.precio = precio + 5;
        }else {
            this.precio = precio;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularPrecioPedido(){
        return precio*cantidad;

    }

}
