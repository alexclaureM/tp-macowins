package ar.edu.utn.frba.dds.macowins;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Negocio {
    private List<Ventas> unasVentasConcretadas;
// el negocio es el que calcula por dia
    public List<Ventas> ganaciaDelDia(Date unaFecha){
        return (List<Ventas>) unasVentasConcretadas.stream().filter(unaVenta -> unaVenta.esLaFecha(unaFecha));
    }
    public int gananciasAcumuladas(Date fecha){
        return this.ganaciaDelDia(fecha).stream().collect(Collectors.summingInt(Ventas::gananciaPorLasPrendas));
    }
}
