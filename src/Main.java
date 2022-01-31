import models.Clasica;
import models.Factura;
import models.Pedido;
import models.Vacuno;

import java.util.ArrayList;

public class Main {

    public static void  main(String[] args){
        Vacuno pedidoHamburguesaVacuna = new Vacuno(20, true, 3);
        Clasica pedidoHamburguesaClasica = new Clasica(18,false, 2);
        ArrayList <Pedido> pedido = new ArrayList<Pedido>();
        pedido.add(pedidoHamburguesaVacuna);
        pedido.add(pedidoHamburguesaClasica);
        Factura factura = new Factura("Diana Vargas",3150476, pedido);
        factura.imprimirFactura();
    }
}
