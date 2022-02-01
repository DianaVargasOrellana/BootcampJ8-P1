import models.*;

import java.util.ArrayList;

public class Main {

    public static void  main(String[] args){

        Vacuno pedidoHamburguesaVacuna = new Vacuno(20, true, 3);
        Clasica pedidoHamburguesaClasica = new Clasica(18,false, 2);
        Energizante pedidoBebidaEnergizante = new Energizante(10,2, Litro.UNLITRO);
        ArrayList <Pedido> pedido = new ArrayList<Pedido>();
        pedido.add(pedidoHamburguesaVacuna);
        pedido.add(pedidoHamburguesaClasica);
        pedido.add(pedidoBebidaEnergizante);
        Factura factura = new Factura("Diana Vargas",3150476, pedido);
        factura.imprimirFactura();

        System.out.println("-------------------------------------------------------");
        JefeCocina jefe = new JefeCocina("Adrian Cuba", 5000.0);
        Ayudante ayudante1 = new Ayudante("Abdiel Orellana", 1800.0);
        Ayudante ayudante2 = new Ayudante("Nigel Davila", 1800.0);
        Ayudante ayudante3 = new Ayudante("Alejandra Vargas", 1800.0);
        Cajero cajero1 = new Cajero("Bruno Benavides", 3000.0);
        Cajero cajero2 = new Cajero("Drayko Escobar", 3000.0);
        Mesero mesero1 = new Mesero("Diana Vargas", 2100.0);
        Mesero mesero2 = new Mesero("Irvin Chavalier", 2100.0);
        Mesero mesero3 = new Mesero("Vania Catorceno", 2100.0);
        ArrayList<Empleado> lista = new ArrayList<>();
        lista.add(jefe);
        lista.add(ayudante1);
        lista.add(ayudante2);
        lista.add(ayudante3);
        lista.add(cajero1);
        lista.add(cajero2);
        lista.add(mesero1);
        lista.add(mesero2);
        lista.add(mesero3);
        DetalleSalario detalle = new DetalleSalario(lista);
        detalle.DetalleSalarios();
    }
}
