package models;

import java.util.ArrayList;

public class Factura {
    private String nombreCliente;
    private int nit;
    private ArrayList<Pedido> pedido;
    //private int cantidad;
    public Factura(String nombreCliente, int nit, ArrayList<Pedido> pedido ){
        this.nombreCliente = nombreCliente;
        this.nit = nit;
        this.pedido = pedido;
    }

    public void imprimirFactura(){
        System.out.println("---------FACTURA---------");
        System.out.println("Nit: " + nit);
        System.out.println("Señor(es): " + nombreCliente);
        System.out.println("-------------------------");
        System.out.println("Cant -- Detalle:        -----------------------------        P.Unit -- Subtotal");
        for (Pedido p: pedido){
            System.out.println(p.cantidad + " --     " + p.getNombre() + "    --       " +p.precio + "--" + p.calcularPrecioPedido()  );
        }
        int calcularTotal = CalcularTotal();
        System.out.println("Total Bs. " + calcularTotal);
    }

    private int CalcularTotal() {
        int total = 0;
        for (Pedido p : pedido){
            total += p.calcularPrecioPedido();
        }
        return  total;
    }
}
