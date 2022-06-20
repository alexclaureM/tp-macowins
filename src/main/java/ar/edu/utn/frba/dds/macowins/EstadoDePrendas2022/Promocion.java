package ar.edu.utn.frba.dds.macowins.EstadoDePrendas2022;

public class Promocion implements EstadoActualPrenda{
    private int descuentoDefinido;

    public Promocion(int descuentoDefinido) {
        this.descuentoDefinido = descuentoDefinido;
    }

    @Override
    public int precioFinalPorDescuento(int unValor) {
        return unValor - descuentoDefinido;
    }
}
