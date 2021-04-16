package ar.edu.utn.frba.dds.macowins.EstadoPrendasFolder;

public class Promocion extends EstadoPrenda{
    public int valorDescuentoUsuario;

    public Promocion(int valorDescuentoUsuario) {
        this.valorDescuentoUsuario = valorDescuentoUsuario;
    }

    @Override
    public int descuentoPorEstadoPrenda(int unValor) {
        return valorDescuentoUsuario;
    }
}

