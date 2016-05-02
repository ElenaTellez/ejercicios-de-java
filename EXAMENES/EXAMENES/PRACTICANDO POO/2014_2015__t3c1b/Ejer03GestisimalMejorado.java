/**
 * 3. Modifica la aplicación Gestisimal realizada en clase añadiendo las siguientes mejoras:
 * a Cada artículo debe tener un campo - variable de instancia - que indique el tipo de
 * producto: “hogar y jardín”, “electrónica”, “perfumería”, etc. Se debe actualizar el listado,
 * alta, modificación y borrado para tener en cuenta esta información.
 * b El listado debe aparecer ordenado por el código del artículo (en orden alfabético si se
 * trata de una cadena de caracteres o de menor a mayor si se trata de un dato numérico)
 * c El programa debe permitir hacer un listado por tipo de producto (se pide por teclado).
 *    
 *  @author Elena Téllez
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections ;

public class Ejer03GestisimalMejorado {
  
  static ArrayList<Articulo> a = new ArrayList<Articulo>();
  
  public static void main(String[] args) {

    HashMap<String, Integer> lineasFra = new HashMap<String, Integer>();
    ArrayList<String> tipo = new ArrayList<String>();
    
    int opcion;
    int listado;
    int opcion2;
    int i;
    int stockIntro;
    int unidades = 0;
    int unidadesEnFactura = 0;
    double precioDeCompraIntro;
    double precioDeVentaIntro;
    double subtotal;
    double baseImponible;
    double totalFactura;
    String codigo;
    String codigoIntro = "";
    String descripcionIntro;
    String tipoIntro;
    String precioDeCompraIntroString;
    String precioDeVentaIntroString;
    String stockIntroString;
    
    // Menu ////////////////////////////////////////////////////////////
    do {
      System.out.println("\n\nG E S T I S I M A L");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Venta");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
				
        case 1: // Listado /////////////////////////////////////////////
					
					do {						
					System.out.println("\nLISTADO\n=======");
					System.out.println("1. Listado ordenado por el código del artículo");
					System.out.println("2. Listado por tipo de producto");
					System.out.println("3. Salir");
					System.out.print("Introduzca una opción: ");
					listado= Integer.parseInt(System.console().readLine());
					
						switch (listado) {
						
							case 1:
								if (tipo.size()>0) {
								System.out.println("\nLISTADO POR CODIGO\n==============");
								Collections.sort(a);          
								for(Articulo aux : a) {
									System.out.println(aux);
								}
							} else {
								System.out.println("No hay ningun articulo introducido");
								}							
							break;
						
							case 2: 	
						
							if (tipo.size()>0) {
								System.out.println("\nLISTADO POR TIPO DE PRODUCTO\n===========================");
								System.out.println("Por favor elija un tipo de artículo:" + tipo );
								ArrayList<String> sinRepetir = new ArrayList<String>();
										for(int l = 0; l < tipo.size(); l++) {				
											for(int j = 0; j < tipo.size(); j++) {													
													if(tipo.get(l) != tipo.get(j)) {
													sinRepetir.add(tipo.get(l)); 
													}
											}								 
                    } 
                    System.out.print(sinRepetir);
								System.out.print("Tipo: ");
								String tipoEscogido = System.console().readLine();
							
								if  (!tipo.contains(tipoEscogido)) {
										System.out.println("El tipo introducido no se encuentra");
									} else {  
										for (Articulo j : a){ 	
											if  (j.getTipo().equals(tipoEscogido)) {
												System.out.println(j);
											} 										
										}
									}
							} else {
								System.out.println("No hay ningun articulo introducido");
								break;
							}	
							break;
						}
					} while (listado != 3);

        break;
				 	
        case 2: // Alta ////////////////////////////////////////////////
          System.out.println("\nNUEVO ARTÍCULO\n==============");
            
          System.out.println("Por favor, introduzca los datos del artículo.");  
          System.out.print("Código: ");
            
          do {
            codigoIntro = System.console().readLine();
            if (posicion(codigoIntro) != -1) {
              System.out.print("Ese código ya existe.\nIntroduzca otro código: ");
            }
          } while  (posicion(codigoIntro) != -1);
          
          System.out.print("Descripcion: ");
          descripcionIntro = System.console().readLine();
          
          System.out.print("Tipo: ");
          tipoIntro = System.console().readLine();
						if (!tipo.contains(tipoIntro)) {
              tipo.add(tipoIntro);
            }
          
          System.out.print("Precio de compra: ");
          precioDeCompraIntro = Double.parseDouble(System.console().readLine());
          
          System.out.print("Precio de venta: ");
          precioDeVentaIntro = Double.parseDouble(System.console().readLine());
          
          System.out.print("Stock: ");
          stockIntro = Integer.parseInt(System.console().readLine());
          
          a.add(new Articulo(codigoIntro, descripcionIntro, tipoIntro, precioDeCompraIntro, precioDeVentaIntro, stockIntro));
          
          break;
 
        case 3: // Baja ////////////////////////////////////////////////
          System.out.println("\nBAJA\n====");
          System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
          codigoIntro = System.console().readLine();
      
          if (posicion(codigoIntro) == -1) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
						i = posicion(codigoIntro);
            tipo.remove(a.get(i).getTipo()); // borro el tipo del articulo por si es el unico con este tipo
            a.remove(posicion(codigoIntro));             
            System.out.println("articulo borrado.");  
          }
          
          break;

        case 4: // Modificación ////////////////////////////////////////
          System.out.println("\nMODIFICACIÓN\n============");
          System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");

          do {
            codigoIntro = System.console().readLine();
            if (posicion(codigoIntro) != -1) {
              System.out.println("No hay ningún artículo con ese código.\nIntroduzca otro código: ");
            }
          } while  (posicion(codigoIntro) == -1);
          
          i = posicion(codigoIntro);

          System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
    
          System.out.println("Código: " + a.get(i).getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntro = System.console().readLine();
          if (!codigoIntro.equals("")) {
            a.get(i).setCodigo(codigoIntro);
          }
          
          System.out.println("Descripción: " + a.get(i).getDescripcion());
          System.out.print("Nueva descripción: ");
          descripcionIntro = System.console().readLine();
          if (!descripcionIntro.equals("")) {
            a.get(i).setDescripcion(descripcionIntro);
          }
          
          System.out.println("Tipo: " + a.get(i).getTipo());
          System.out.print("Nuevo tipo: ");
          tipoIntro = System.console().readLine();          
          if (!tipoIntro.equals("")) { 
            a.get(i).setTipo(tipoIntro);	             
            tipo.remove(a.get(i).getTipo()); //borro el tipo del arraylist para que no me aparezca si es el 
            if (!tipo.contains(tipoIntro)) {  //unico articulo con este tipo
              tipo.add(tipoIntro); //añado el tipo  si no existe en arraylist             
            }
            			
          }
          System.out.println("Precio de compra: " + a.get(i).getPrecioDeCompra());
          System.out.print("Nuevo precio de compra: ");
          precioDeCompraIntroString = System.console().readLine();
          if (!precioDeCompraIntroString.equals("")) {
            a.get(i).setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroString));
          }

          System.out.println("Precio de venta: " + a.get(i).getPrecioDeVenta());
          System.out.print("Nuevo precio de venta: ");
          precioDeVentaIntroString = System.console().readLine();
          if (!precioDeVentaIntroString.equals("")) {
            a.get(i).setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroString));
          }

          System.out.println("Stock: " + a.get(i).getStock());
          System.out.print("Nuevo stock: ");
          stockIntroString = System.console().readLine();
          if (!stockIntroString.equals("")) {
            a.get(i).setStock(Integer.parseInt(stockIntroString));
          }

          break;

          case 5: // Entrada de mercancía //////////////////////////////
            System.out.println("\nENTRADA DE MERCANCÍA\n====================");
            System.out.print("Por favor, introduzca el código del artículo: ");
          
      
            do {
                codigoIntro = System.console().readLine();
                if (posicion(codigoIntro) != -1) {
                  System.out.println("No hay ningún artículo con ese código.\nIntroduzca otro código: ");
                }
            } while  (posicion(codigoIntro) == -1);
            
            i = posicion(codigoIntro);
            
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(a.get(i));
            System.out.print("Introduzca el número de unidades que entran al almacén: ");
            stockIntro = Integer.parseInt(System.console().readLine());
            a.get(i).setStock(stockIntro + a.get(i).getStock());
            System.out.println("La mercancía ha entrado en el almacén.");  

            break;

            case 6: // Venta
              System.out.println("\nVENTA\n=====");
              
              do {
                  System.out.println("\n1. Añadir artículo");
                  System.out.println("2. Generar factura");
                  System.out.println("3. Cancelar");
                  System.out.print("Introduzca una opción: ");
                  opcion2 = Integer.parseInt(System.console().readLine());

                  switch (opcion2) {

                    case 1: // Añadir línea ////////////////////////////
                      System.out.print("Por favor, introduzca el código del artículo: ");
                      codigoIntro = System.console().readLine();
                      i = posicion(codigoIntro);
                      
                      if (i == -1) {
                        System.out.println("No hay ningún artículo con ese código.");
                      } else {
                        System.out.println(a.get(i));
                  
                        if (lineasFra.containsKey(codigoIntro)) {
                          unidadesEnFactura = lineasFra.get(codigoIntro);
                        } else {
                          unidadesEnFactura = 0;
                        }

                        System.out.println("Unidades en la factura provisional: " + unidadesEnFactura);
         
                        System.out.print("Unidades que quiere incorporar a la factura: ");
                        unidades = Integer.parseInt(System.console().readLine());

                        if ((a.get(i).getStock()) - unidadesEnFactura < unidades) {
                          System.out.println("No hay suficiente stock. Puede añadir a la venta un máximo de " + (a.get(i).getStock() - unidadesEnFactura) + " unidades de ese producto.");
                        } else if (lineasFra.containsKey(codigoIntro)) {
                          lineasFra.put(codigoIntro, lineasFra.get(codigoIntro) + unidades);
                        } else {
                          lineasFra.put(codigoIntro, unidades);
                        }
                      }

                      // Muestra las líneas
                      System.out.println("\n\n CÓDIGO |   DESCRIPCIÓN   | TIPO | UNIDADES | PRECIO UNID. | SUBTOTAL");
                      System.out.println("------------------------------------------------------------------------");
                      for (Map.Entry pareja: lineasFra.entrySet()) {
                        codigo = pareja.getKey().toString();
                        i = posicion(codigo);
                        unidades = Integer.parseInt(pareja.getValue().toString());
                        subtotal = unidades * a.get(i).getPrecioDeVenta();
                        System.out.printf(" %6s | %15s | %4s | %8d | %12.2f | %8.2f\n", codigo, a.get(i).getDescripcion(), a.get(i).getTipo(), unidades, a.get(i).getPrecioDeVenta(), subtotal);
                      }
                      
                      break;

                      case 2: // Genera la factura ///////////////////////
                        baseImponible = 0;
                        System.out.println("\n\n CÓDIGO |   DESCRIPCIÓN   | TIPO | UNIDADES | PRECIO UNID. | SUBTOTAL");
                        System.out.println("------------------------------------------------------------------------");
                        for (Map.Entry pareja: lineasFra.entrySet()) {
                          codigo = pareja.getKey().toString();
                          i = posicion(codigo);
                          unidades = Integer.parseInt(pareja.getValue().toString());
                          subtotal = unidades * a.get(i).getPrecioDeVenta();
                          System.out.printf(" %6s | %15s | %4s | %8d | %12.2f | %8.2f\n", codigo, a.get(i).getDescripcion(), a.get(i).getTipo(), unidades, a.get(i).getPrecioDeVenta(), subtotal);
                          baseImponible += subtotal;
                          a.get(i).setStock(a.get(i).getStock() - unidades); // decrementa el stock
                        }

                        System.out.println("------------------------------------------------------------------------");
                        System.out.printf("                                      BASE IMPONIBLE: %8.2f \n", baseImponible);
                        System.out.printf("                                           IVA (21%%): %8.2f \n", baseImponible * 0.21);
                        System.out.printf("                                               TOTAL: %8.2f \n", baseImponible * 1.21);
                        
                        System.out.println("\n\nFactura generada.\nPulse INTRO para volver al menú principal.");
                        System.console().readLine();
                        
                        break;
            } // switch (venta)

          } while (opcion2 == 1);

          break;

      } // switch (menú principal)

    } while (opcion != 7);

  } // main

  /**
   * Devuelve la posición de un artículo en el <code>ArrayList</code> o
   * <code>-1</code> si no existe.
   * 
   * @param  codigo código del artículo que se buscará dentro del <code>
   *                ArrayList</code> que contiene todos los artículos
   * @return        posición que ocupa el artículo dentro del <code>
   *                ArrayList</code> o <code>-1</code> si no existe
   */
  
  static public int posicion(String codigo) {
    int i = -1;
    for (Articulo aux : a) {
      i++;
      if (aux.getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
  
}
  
   
  
 
