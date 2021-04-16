package ar.edu.utn.frba.dds.macowins;

//import ar.edu.utn.frba.dds.macowins.PrendaFolder;
import ar.edu.utn.frba.dds.macowins.EstadoPrendasFolder.Liquidacion;
import ar.edu.utn.frba.dds.macowins.EstadoPrendasFolder.Nuevo;
import ar.edu.utn.frba.dds.macowins.EstadoPrendasFolder.Promocion;
import ar.edu.utn.frba.dds.macowins.PrendaFolder.Camisa;
import ar.edu.utn.frba.dds.macowins.PrendaFolder.Saco;
import ar.edu.utn.frba.dds.macowins.PrendaFolder.Pantalon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrendaTest {
  private Camisa unaPrenda;
  private Saco unSaco;
  private Pantalon unPantalon;

  @Test
  public void elTipoDeUnaCamisaNuevaEsCAMISA() {
    unaPrenda = new Camisa(200);
    Nuevo nueva = new Nuevo();
    unaPrenda.setEstado(nueva);
    //assertEquals(camisaNueva(200).getTipo().toString(), "camisa");
    assertEquals(unaPrenda.getTipo().toString(),"camisa");
  }

  @Test
  public void elTipoDeUnSacoEnLiquidacionEsSACO() {
    unSaco = new Saco(200);
    Liquidacion liquidacion = new Liquidacion();
    unSaco.setEstado(liquidacion);
   // assertEquals(sacoEnLiquidacion(200).getTipo().toString(), "SACO");
    assertEquals(unSaco.getTipo().toString(),"saco");
  }

  @Test
  public void elPrecioDeUnaCamisaNuevaEsSuPrecioBase() {
    unaPrenda = new Camisa(4000);
    Nuevo nueva = new Nuevo();
    unaPrenda.setEstado(nueva);
    //assertEquals(camisaNueva(4000).precio(), 4000, 0);
    //assertEquals(camisaNueva(5000).precio(), 5000, 0);
    assertEquals(4000,unaPrenda.precio());
  }

  @Test
  public void elPrecioDeUnSacoEnLiquidacionEsSuLaMitadDeSuPrecioBase() {
    unSaco = new Saco(3000);
    Liquidacion liquidacion = new Liquidacion();
    unSaco.setEstado(liquidacion);
    liquidacion.descuentoPorEstadoPrenda(unSaco.getPrecioBase());
    //assertEquals(sacoEnLiquidacion(3000).precio(), 1500, 0);
    //assertEquals(sacoEnLiquidacion(8000).precio(), 4000, 0);
    assertEquals(1500,unSaco.precio());
  }

  @Test
  public void elPrecioDeUnPantalonEnPromocionEsSuPrecioBaseMenosSuDecuento() {
    unPantalon = new Pantalon(1500);
    Promocion promocionLoca = new Promocion(200);
    unPantalon.setEstado(promocionLoca);
    //assertEquals(pantalonEnPromocion(1500, 200).precio(), 1300, 0);
    //assertEquals(pantalonEnPromocion(1500, 100).precio(), 1400, 0);
    assertEquals(1300,unPantalon.precio());
  }
/*
  private Prenda pantalonEnPromocion(int precioBase, int descuento) {
    // TODO completar
    return null;
  }

/*
  private Prenda camisaNueva(double precioBase) {
    // TODO completar
    return null;
  }

  private Prenda sacoEnLiquidacion(double precioBase) {
    // TODO completar
    return null;
  }

 */
}
