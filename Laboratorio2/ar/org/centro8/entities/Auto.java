package ar.org.centro8.entities;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo,int puertas, Double precio) {
        super(marca, modelo, precio);
        this.puertas=puertas;
        
    }

    @Override
    public String toString() {
        return "Marca: "+super.getMarca()+" // "+"Modelo: "+super.getModelo()+" // "+"Puertas: "+puertas+" // "+"Precio: $"+super.getPrecioFormat();
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

   



    

    

   

    

    

    
   
    

  
    
    
}
