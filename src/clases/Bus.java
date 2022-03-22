/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author arni
 */
public class Bus extends Movilidad{
    int nroAsientosDiscapacitados;
    
    public Bus(){
        super();
        this.nroAsientosDiscapacitados = 0;
    }

    public Bus(String marca , String chasis, int modelo, String color, String combustible, int cilindrada, String placa, int asientos){
        super(marca, chasis, modelo, color, combustible, cilindrada, placa);
        this.nroAsientosDiscapacitados = asientos;
    }

    public int getNroAsientosDiscapacitados() {
        return nroAsientosDiscapacitados;
    }

    public void setNroAsientosDiscapacitados(int nroAsientosDiscapacitados) {
        this.nroAsientosDiscapacitados = nroAsientosDiscapacitados;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Número de asientos para discapacitados: "+this.nroAsientosDiscapacitados);
    }
    
    
}
