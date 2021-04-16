package ar.edu.utn.frba.dds.macowins.PrendaFolder;

public class Pantalon extends Prenda{

    public Pantalon(int precioBase) {
        super(precioBase);
    }

    @Override
    public String getTipo() {
        return "pantalon";
    }
}
