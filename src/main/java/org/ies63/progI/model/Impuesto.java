package org.ies63.progI.model;

public interface Impuesto {
  public static final double IVA = 0.21;
  // metodo privado
  private static double AlicuotaEnPorcentaje(){
    return  IVA *100;
  }
  // metodo estatico
  static void MostrarAlicuotaIva(){
    System.out.println("Alicuota IVA: " + AlicuotaEnPorcentaje() + "%");
  }
  //metodo abstracto
  public void CalcularImpuesto(double precio);
}
