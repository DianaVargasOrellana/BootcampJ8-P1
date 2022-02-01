package models;

import java.util.ArrayList;

public class DetalleSalario {
    ArrayList<Empleado> listaEmpleados;
    public DetalleSalario(ArrayList<Empleado> listaEmpleados){
        this.listaEmpleados = listaEmpleados;
    }

    public void DetalleSalarios(){
        System.out.println("-----------DETALLE----------");
        System.out.println("Nombre:                 Puesto:             Salario:"     );
        for (Empleado emp: listaEmpleados){
            System.out.println(emp.getNombre() + "            " + emp.getClass().getSimpleName() +"           "+ emp.getSalario());
        }
        System.out.println("Total: " + calcularPagoSalarioTotal());
    }

    private double calcularPagoSalarioTotal(){
        double total = 0;
        for (Empleado emp: listaEmpleados){
            total += emp.getSalario();
        }
        return  total;
    }
}
