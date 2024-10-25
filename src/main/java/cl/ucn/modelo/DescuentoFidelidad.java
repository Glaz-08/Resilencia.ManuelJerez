public class descuentoFidelidad extends DescuentosStrategy{
    List<Integer> calcularDescuento(List<Producto> productos, String fechaNacimiento, String anhoRegistro,
    String fechaActual){
        int precioInicial = 0;
        int descuentoFidelidad = 0;
        int descuentoCumpleanhos = 0;
        int descuentoCategoria = 0;
        int descuentoCantProductos = 0;
        
         //Fidelidad
         if (Integer.valueOf(fechaActual.substring(0,4)) - Integer.valueOf(anhoRegistro) >= 2){
             descuentoFidelidad = 500;
         }
         return new ArrayList<Integer>(Arrays.asList(precioInicial,descuentoFidelidad, descuentoCumpleanhos,
                descuentoCategoria, descuentoCantProductos, precioFinal ));
   }
}