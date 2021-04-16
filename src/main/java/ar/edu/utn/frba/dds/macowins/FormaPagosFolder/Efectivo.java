package ar.edu.utn.frba.dds.macowins.FormaPagosFolder;

public class Efectivo extends TipoPago{

    @Override
    public int recargo(int unasCoutas) {
        return 0;
    }
}
