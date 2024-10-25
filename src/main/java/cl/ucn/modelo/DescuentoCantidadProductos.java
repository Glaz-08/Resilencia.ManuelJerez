public class DescuentoCantidadProductos extends DescuentosStrategy{
    List<Integer> calcularDescuento(List<Producto> productos, String fechaNacimiento, String anhoRegistro,
    String fechaActual){

        int precioInicial = 0;
        int descuentoFidelidad = 0;
        int descuentoCumpleanhos = 0;
        int descuentoCategoria = 0;
        int descuentoCantProductos = 0;
        if (productos.size() > 2){
            descuentoCantProductos = 100;
            int precioFinal = precioInicial - descuentoFidelidad - descuentoCumpleanhos - descuentoCategoria -
            descuentoCantProductos;
        }
        //requerimiento 3
        else if(productos.size()>50000){
            for (Producto producto : productos) {
                descuentoCantProductos += producto.getPrecioProducto()*0.10;//descuento del 10%
            }
        }
        return new ArrayList<Integer>(Arrays.asList(precioInicial,descuentoFidelidad, descuentoCumpleanhos,
                descuentoCategoria, descuentoCantProductos, precioFinal ));
    }

}