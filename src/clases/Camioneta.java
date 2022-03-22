/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author arni
 */
public class Camioneta extends Movilidad{
    
    boolean aireAcondicionado;
    
    public Camioneta(){
        super();
        this.aireAcondicionado = false;
    }
    
   public Camioneta(String placa){
        super(placa);
    
    }
    
    public Camioneta(String marca , String chasis, int modelo, String color, String combustible, int cilindrada, String placa, double compra, double venta, boolean aire){
        super(marca , chasis, modelo, color, combustible, cilindrada, placa, compra, venta );
        this.aireAcondicionado = aire;
    }
    
        public Camioneta(String marca , String chasis, int modelo, String color, String combustible, int cilindrada, String placa, boolean aire){
        super(marca , chasis, modelo, color, combustible, cilindrada, placa );
        this.aireAcondicionado = aire;
    }
 
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    
    public String comprobarAireAcondicionado(){
        return this.aireAcondicionado?"Si":"No";
    }
    
    
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Aire Acondicionado: "+ this.comprobarAireAcondicionado());
    }
}
