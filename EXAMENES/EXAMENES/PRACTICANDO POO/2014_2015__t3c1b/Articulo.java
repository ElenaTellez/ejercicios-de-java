import java.util.Collections ;
import java.util.ArrayList ;

public class Articulo implements Comparable<Articulo> {
  private String codigo;
  private String descripcion;
  private String tipo;
  private double precioDeCompra;
  private double precioDeVenta;
  private int stock;

  public Articulo(String co, String de, String ti, double pc, double pv, int st) {
    this.codigo = co;
    this.descripcion = de;
    this.tipo = ti;
    this.precioDeCompra = pc;
    this.precioDeVenta = pv;
    this.stock = st;
  }

  public Articulo(String co) {
    this.codigo = co;
     
  }
  
  
  public String getCodigo() {
    return codigo;
  }
  
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  public String getDescripcion() {
    return descripcion;
  }
  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  public String getTipo() {
    return tipo;
  }
  
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getPrecioDeCompra() {
    return precioDeCompra;
  }

  public void setPrecioDeCompra(double precioDeCompra) {
    this.precioDeCompra = precioDeCompra;
  }

  public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    String cadena = "------------------------------------------";
    cadena += "\nCódigo: " + this.codigo;  
    cadena += "\nDescripción: " + this.descripcion;  
    cadena += "\nTipo: " + this.tipo;    
    cadena += "\nPrecio de compra: " + this.precioDeCompra;
    cadena += "\nPrecio de venta: " + this.precioDeVenta;
    cadena += "\nStock: " + this.stock + " unidades";
    cadena += "\n------------------------------------------";
    return cadena;
  }
  
  public int compareTo(Articulo g) {
		return (this.codigo).compareTo(g.getCodigo()); 		
	}
}

