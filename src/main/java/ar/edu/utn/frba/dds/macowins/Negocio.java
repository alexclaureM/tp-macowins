package ar.edu.utn.frba.dds.macowins;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

public class Negocio {
    private Collection<Venta> ventasDelDia;

    private int gananciaDelDia(java.util.Date unDia){
        return this.ventasDelDia(unDia).stream().collect(Collectors.summingInt(Venta::ganancia));
    }
    private Collection <Venta> ventasDelDia (java.util.Date unDia){
        return this.ventasDelDia.stream().filter((Venta unaVenta) -> (unaVenta.getFecha() == unDia)).collect(Collectors.toList());
    }
}
