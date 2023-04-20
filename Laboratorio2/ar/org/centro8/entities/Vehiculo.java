package ar.org.centro8.entities;

import java.text.DecimalFormat;

public abstract class Vehiculo implements Comparable <Vehiculo> {
    private String marca;
    private String modelo;
    private Double precio;

    

    

    public Vehiculo(String marca, String modelo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + " // modelo=" + modelo + " // precio=" + precio + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getPrecioFormat() {
        DecimalFormat df= new DecimalFormat("###,###,###.00");
        return df.format(precio);
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }



    public int compareTo(Vehiculo vehi) {
        DecimalFormat df=new DecimalFormat("000");
        String thisVehiculo=this.getMarca()+" // "+this.getModelo()+" // "+df.format(this.getPrecio());
        String vehiVehiculo=vehi.getMarca()+" // "+vehi.getModelo()+" // "+df.format(vehi.getPrecio());
        return thisVehiculo.compareTo(vehiVehiculo);
    }

    



    
    
}
