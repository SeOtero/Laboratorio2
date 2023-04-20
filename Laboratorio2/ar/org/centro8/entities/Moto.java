package ar.org.centro8.entities;

public class Moto extends Vehiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, String cilindrada, Double precio) {
        super(marca, modelo, precio);
        this.cilindrada=cilindrada;
        
    }

    @Override
    public String toString() {
        return "Marca: "+super.getMarca()+" // "+"Modelo: "+super.getModelo()+" // "+"Cilindrada: "+ cilindrada+" // "+"Precio: $"+super.getPrecioFormat();
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

  




    

    
}
