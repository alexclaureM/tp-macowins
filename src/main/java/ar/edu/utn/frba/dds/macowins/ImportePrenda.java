package ar.edu.utn.frba.dds.macowins;

import ar.edu.utn.frba.dds.macowins.PrendaFolder2022.Prenda;

public class ImportePrenda {
    private Prenda unaPrenda;
    private int cantidad;

    public int importeTotalPrenda(){
        return unaPrenda.getPrecioBase() * this.getCantidad();
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
}
