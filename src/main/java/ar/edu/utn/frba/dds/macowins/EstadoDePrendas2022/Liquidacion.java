package ar.edu.utn.frba.dds.macowins.EstadoDePrendas2022;

public class Liquidacion implements EstadoActualPrenda{
    @Override
    public int precioFinalPorDescuento(int unValor) {
        return (int)0.5 * unValor; //casteo
    }
}
