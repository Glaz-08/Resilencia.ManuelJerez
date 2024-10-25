public class DescuentoCumpleanos extends DescuentosStrategy{
    List<Integer> calcularDescuento(List<Producto> productos, String fechaNacimiento, String anhoRegistro,
    String fechaActual){
        int precioInicial = 0;
        int descuentoFidelidad = 0;
        int descuentoCumpleanhos = 0;
        int descuentoCategoria = 0;
        int descuentoCantProductos = 0;

           //Cumpleaños
           LocalDate date1 = LocalDate.parse(fechaNacimiento, formatter);
           LocalDate date2 = LocalDate.parse(fechaActual, formatter);
           boolean esMismoDiayMes = (date1.getMonthOfYear() == date2.getMonthOfYear()) &&
            (date1.getDayOfMonth() == date2.getDayOfMonth());
           if (esMismoDiayMes){
            descuentoCumpleanhos = 100;
           }
           return new ArrayList<Integer>(Arrays.asList(precioInicial,descuentoFidelidad, descuentoCumpleanhos,
                descuentoCategoria, descuentoCantProductos, precioFinal ));
   }
}