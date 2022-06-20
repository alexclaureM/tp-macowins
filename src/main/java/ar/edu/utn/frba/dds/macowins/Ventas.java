package ar.edu.utn.frba.dds.macowins;

import ar.edu.utn.frba.dds.macowins.PrendaFolder2022.Prenda;

import java.util.Date;
import java.util.List;

public class Ventas {
    private List<ImportePrenda> importePrendas;
    private Date fechaPrendaVendida;

    public int gananciaPorLasPrendas(){
        return importePrendas.stream().mapToInt(unaPrenda -> unaPrenda.importeTotalPrenda()).sum();
    }

    public Date getFechaPrendaVendida() {
        return fechaPrendaVendida;
    }
    public boolean esLaFecha(Date unaFecha){
        return this.getFechaPrendaVendida() == unaFecha;
    }
}
