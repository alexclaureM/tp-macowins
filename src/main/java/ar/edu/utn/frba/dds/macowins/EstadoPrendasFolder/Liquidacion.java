package ar.edu.utn.frba.dds.macowins.EstadoPrendasFolder;


public class Liquidacion extends EstadoPrenda{
    @Override
    public int descuentoPorEstadoPrenda(int unValor) {
        return (int)(unValor * 0.5) ;
    }
}

