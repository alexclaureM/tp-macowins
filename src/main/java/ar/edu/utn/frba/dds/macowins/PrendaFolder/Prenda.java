package ar.edu.utn.frba.dds.macowins.PrendaFolder;

import ar.edu.utn.frba.dds.macowins.EstadoPrendasFolder.EstadoPrenda;

public abstract class Prenda {
    private int precioBase;
    private EstadoPrenda estado;

    public Prenda(int precioBase ) {
        this.precioBase = precioBase;

    }
    public int getPrecioBase() {
        return precioBase;
    }

    public abstract String getTipo();

    public void setEstado(EstadoPrenda estado) {
        this.estado = estado;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int precio(){
        return this.getPrecioBase() - estado.descuentoPorEstadoPrenda(this.getPrecioBase());
    }

}
