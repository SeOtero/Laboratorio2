package ar.org.centro8.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.org.centro8.entities.Auto;
import ar.org.centro8.entities.Moto;
import ar.org.centro8.entities.Vehiculo;

public class TestLaboratorio2 {
    public static void main(String[] args) {
        
        List<Vehiculo> list = cargaVehiculos();

        separador();

        vehiculoMasCaro(list);

        vehiculoMasBarato(list);

        contieneLetraY(list);

        separador();

        vehiculoMayorAMenor(list);

        separador();
        
        ordenNatural(list);


    }

    private static List<Vehiculo> cargaVehiculos() {
        //LISTA DE VEHICULOS
        List<Vehiculo>list=new ArrayList();
                            list.add(new Auto("Peugeot", "206", 4,200000.00));
                            list.add(new Moto("Honda", "Titan", "125c", 60000.00));
                            list.add(new Auto("Peugeot", "208", 5, 250000.00));
                            list.add(new Moto("Yamaha", "YBR", "160c", 80500.50));
                            list.stream().forEach(System.out::println);
                            return list;
    }

    private static void vehiculoMasCaro(List<Vehiculo> list) {
        //VEHICULO MÁS CARO
        double VehiculoMasCaro = 
        list
                .stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();

        System.out.print("Vehiculo más Caro: " );
        
        list
                .stream()
                .filter(p->p.getPrecio()==VehiculoMasCaro)
                .forEach(v->System.out.println(v.getMarca()+" "+v.getModelo()));
    }

    private static void vehiculoMasBarato(List<Vehiculo> list) {
        //VEHICULO MÁS BARATO
        double VehiculoMasBarato = 
        list
                .stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get()
                .getPrecio();
        System.out.print("Vehiculo más Barato: " );
        list
                .stream()
                .filter(p->p.getPrecio()==VehiculoMasBarato)
                .forEach(v->System.out.println(v.getMarca()+" "+v.getModelo()));
    }

    private static void contieneLetraY(List<Vehiculo> list) {
        //VEHICULO QUE CONTIENE EN MODELO LA LETRA "Y"
        System.out.print("Vehiculo que contiene en el modelo la letra 'Y':");
        list
                .stream()
                .filter(v->v.getModelo().contains("Y"))
                .forEach(v->System.out.println(v.getMarca()+" "+v.getModelo()+" $"+v.getPrecioFormat()));
    }

    private static void vehiculoMayorAMenor(List<Vehiculo> list) {
        //VEHICULOS ORDENADOS POR PRECIO DE MAYOR A MENOR
        System.out.println("Vehiculos ordenados por precio mayor a menor");
        list
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .forEach(v->System.out.println(v.getMarca()+" "+v.getModelo()));
    }

    private static void separador() {
        System.out.println("=======================================================");
    }

    private static void ordenNatural(List<Vehiculo> list) {
        //VEHICULOS ORDENADOS POR ORDEN NATURAL
        System.out.println("Vehiculos ordenados por orden natural (marca,modelo,precio)");

        list
                .stream()
                .sorted()
                .forEach(System.out::println);
    }
    
    
    
    
    
}
