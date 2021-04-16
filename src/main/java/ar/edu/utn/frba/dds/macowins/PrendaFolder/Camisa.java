
package ar.edu.utn.frba.dds.macowins.PrendaFolder;

public class Camisa extends Prenda{
    public String tipo;
    // por el constructor de precioBase
    public Camisa(int precioBase) {
        super(precioBase);
    }

    @Override
    public String getTipo() {
        return "camisa";
    }


}
