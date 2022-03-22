/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author arni
 */
public class Moto extends Movilidad {
    boolean baulera;
    
    public Moto(){
        super();
        this.baulera = false;
    }
    
    public Moto(String marca , String chasis, int modelo, String color, String combustible, int cilindrada, String placa, double compra, double venta, boolean baulera){
            super(marca, chasis, modelo, color, combustible, cilindrada, placa, compra, venta);
            this.baulera = baulera;
    }

    public boolean isBaulera() {
        return baulera;
    }

    public void setBaulera(boolean baulera) {
        this.baulera = baulera;
    }
    
    public String estadoBaulera(){
        return this.baulera?"Si":"No";
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Baulera: "+this.estadoBaulera());
    }
    
}
