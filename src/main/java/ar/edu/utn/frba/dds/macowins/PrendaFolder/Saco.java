package ar.edu.utn.frba.dds.macowins.PrendaFolder;


public class Saco extends Prenda{

    // por que tiene un precio Base como constructor
    public Saco(int precioBase) {
        super(precioBase);
    }

    @Override
    public String getTipo() {
        return "saco";
    }

}
