public class TiendaMascotas {
    private Especie[] especies;
    private int totalEspecies;

    public TiendaMascotas(){
        especies = new Especie[100]; // capacidad que púse
        totalEspecies = 0;
    }

    public void agregarEspecie(Especie especie){
        if (totalEspecies < especies.length) {
            especies[totalEspecies++] = especie;
        } else {
            System.out.println("No se puede agregar más especies.");
        }
    }
    public void mostrarEspecies() {
      for (int i=0; i<totalEspecies;i++){
          especies [i].mostrarInfo();
          System.out.println("-----------------");
      }
    }
    public String venderMascota(String nombre, int cantidad){
        for (int i = 0; i < totalEspecies; i++) {
            if (especies[i].getNombre().equalsIgnoreCase(nombre)) {
                return especies[i].vender(cantidad);
            }
        }
        return "Especie no encontrada.";
    }
    public String comprarMascota(String nombre, int cantidad) {
        for (int i = 0; i < totalEspecies; i++) {
            if (especies[i].getNombre().equalsIgnoreCase(nombre)) {
                return especies[i].comprar(cantidad);
            }
        }
        return "Especie no encontrada.";
    }
    public void buscarEspecies(String clase, int vidaMax, double precioMax) {
        for (int i = 0; i < totalEspecies; i++) {
            Especie e = especies[i];
            if ((clase == null || e.getClaseAnimal().equalsIgnoreCase(clase)) &&
                    e.getVidaPromedio() <= vidaMax &&
                    e.getPrecioVenta() <= precioMax) {
                e.mostrarInfo();
                System.out.println("-----");
            }
        }
    }
    public void especieMenosVendida() {
        if (totalEspecies == 0) return;

        Especie menosVendida = especies[0];
        for (int i = 1; i < totalEspecies; i++) {
            if (especies[i].getCantidadVendida() < menosVendida.getCantidadVendida()) {
                menosVendida = especies[i];
            }
        }
        System.out.println("Especie menos vendida:");
        menosVendida.mostrarInfo();
    }
    public double montoPromedioVenta() {
        double total = 0;
        int totalVendidas = 0;
        for (int i = 0; i < totalEspecies; i++) {
            total += especies[i].getPrecioVenta() * especies[i].getCantidadVendida();
            totalVendidas += especies[i].getCantidadVendida();
        }
        if (totalVendidas == 0) return 0;
        return total / totalVendidas;
    }
}
