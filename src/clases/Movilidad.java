/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author arni
 */
public abstract class Movilidad {
    
    String placa;
    String combustible;
    int cilindrada;
    int modelo;
    String color;
    String marca;
    String chasis;
    
    private double precioCompra;
    private double precioVenta;
    
    
    public Movilidad(){
        /*
        this.placa = "";
        this.combustible="";
        this.cilindrada = 0;
        this.modelo = 0;
        this.color = "";
        this.marca = "";
        this.nroRuedas = 0;
        this.precioCompra = 0;
        this.precioVenta = 0;
        this.chasis = "";
        */
    }
    
    public Movilidad(String placa) {
           this.placa = placa;
    }
        
    public Movilidad(String marca , String chasis, int modelo, String color, String combustible, int cilindrada, String placa){
        this.marca = marca;
        this.chasis = chasis;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.cilindrada = cilindrada;
        this.placa = placa;
    }
    
     public Movilidad(String marca , String chasis, int modelo, String color, String combustible, int cilindrada, String placa, double compra, double venta ){
        this.marca = marca;
        this.chasis = chasis;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.cilindrada = cilindrada;
        this.placa = placa;
        this.precioCompra = compra;
        this.precioVenta = venta;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    protected double getPrecioCompra() {
        return precioCompra;
    }

    protected void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    protected double getPrecioVenta() {
        return precioVenta;
    }

    protected void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }    

    public void mostrar(){
        System.out.println("Marca: "+ this.marca+"\n Modelo: "+this.modelo + "\n Color: "+this.color + "\n Combustible: "+this.combustible +"\n Cilindrada: "+this.cilindrada + "\n Placa: "+this.placa + "\n Compra: $$ "+this.precioCompra + "\n Venta: $$ "+ this.precioVenta);
    }
    
    public double descuento(double compra){
        return this.precioVenta -(this.precioVenta*(compra/100));
    }
    
    public double precioConFactura(){
        return this.precioVenta+(this.precioVenta*0.13);
    }

    
    
}
