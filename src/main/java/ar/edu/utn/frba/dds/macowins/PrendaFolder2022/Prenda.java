package ar.edu.utn.frba.dds.macowins.PrendaFolder2022;

import ar.edu.utn.frba.dds.macowins.EstadoDePrendas2022.EstadoActualPrenda;

public class Prenda {
    private int precioBase;
    private EstadoActualPrenda estadoPrenda;

    public Prenda(int precioBase, EstadoActualPrenda unaPrenda) {
        this.precioBase = precioBase;
        this.estadoPrenda = unaPrenda;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public EstadoActualPrenda getestadoPrenda() {
        return estadoPrenda;
    }
}
