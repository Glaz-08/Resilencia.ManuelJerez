public class DescuentoCantegoria extends DescuentosStrategy{
    List<Integer> calcularDescuento(List<Producto> productos, String fechaNacimiento, String anhoRegistro,
    String fechaActual){
        int precioInicial = 0;
        int descuentoFidelidad = 0;
        int descuentoCumpleanhos = 0;
        int descuentoCategoria = 0;
        int descuentoCantProductos = 0;
        
         //Categoria
         for(Producto producto : productos) {
            if (producto.getCategoria().equals("casa"))
                descuentoCategoria = 200;
            break;

            return new ArrayList<Integer>(Arrays.asList(precioInicial,descuentoFidelidad, descuentoCumpleanhos,
                descuentoCategoria, descuentoCantProductos, precioFinal ));
    }
   }
}