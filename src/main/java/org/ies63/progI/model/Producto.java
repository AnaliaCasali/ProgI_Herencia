package org.ies63.progI.model;

public class Producto {

  private int id;
  private  String producto;
  private double precio;
  private  String descripcion;

  static int cantidadProductos = 0;

  public Producto() {
    cantidadProductos++;
    this.id = cantidadProductos;
  }

  public Producto( String producto, double precio, String descripcion) {
    cantidadProductos++;
    this.id = cantidadProductos;
    this.producto = producto;
    this.precio = precio;
    this.descripcion = descripcion;
  }
  public int getId() {
    return id;
  }

  public double getPrecio() {
    return precio;
  }

  public String getProducto() {
    return producto;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Producto{" +
            "id=" + id +
            ", producto='" + producto + '\'' +
            ", precio=" + precio +
            ", descripcion='" + descripcion + '\'' +
            '}';
  }

  public void Mostrar() {
    System.out.println(this.toString() );
  }

  @Override
  public  boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Producto)) return false;

    Producto producto1 = (Producto) o;
    if (Double.compare(producto1.precio, precio) != 0) return false;
    if (!producto.equals(producto1.producto)) return false;
    return descripcion.equals(producto1.descripcion);

  }
  @Override
  public int hashCode() {
    int result=1;
    return result;
  }

}
