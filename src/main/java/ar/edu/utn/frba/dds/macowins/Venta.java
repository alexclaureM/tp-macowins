package ar.edu.utn.frba.dds.macowins;

import ar.edu.utn.frba.dds.macowins.FormaPagosFolder.TipoPago;
import ar.edu.utn.frba.dds.macowins.PrendaFolder.Prenda;

import java.util.Date;


public class Venta {

    private Prenda unaPrenda;
    private int cantidadVendida;
    protected TipoPago tipoPago;
    public java.util.Date fecha ; //puedo hacerle esto a fecha -cosa loca-

    public void venta(java.util.Date unaFecha){
        this.fecha= unaFecha;
    }

    public Date getFecha() {
        return fecha;
    }
    public int ganancia(){
        return cantidadVendida * unaPrenda.precio();
    }
    public int recargoPorPago(){
        return tipoPago.recargo(5);
    }
    public int gananciaTotal(){
        return ((int) (this.ganancia() + recargoPorPago() * (0.01 * unaPrenda.getPrecioBase())));
    }

}
