package ar.edu.utn.frba.dds.macowins.NegocioWins;

import java.util.Collection;
import java.util.stream.Collectors;

public class Negocio {
    private Collection <Venta> ventasDelDia;

    private int gananciaDelDia(java.util.Date unDia){
        return this.ventaDelDia(unDia).stream().collect(Collectors.summingInt(Venta::ganancia));
    }
    private Collection <Venta> ventaDelDia (java.util.Date unDia){
        return ventasDelDia.stream().filter((Venta unaVenta) -> (unaVenta.getFecha() == unDia)).collect(Collectors.toList());
    }
}
