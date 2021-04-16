package ar.edu.utn.frba.dds.macowins.FormaPagosFolder;

public class Tarjeta extends TipoPago{
    @Override
    public int recargo(int unasCoutas) {
        return unasCoutas;
    }
}
