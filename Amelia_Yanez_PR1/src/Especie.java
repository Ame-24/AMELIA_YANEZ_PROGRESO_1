public class Especie {
    private String nombre;
    private int vidaPromedio;
    private String claseAnimal;
    private double precioVenta;
    private int cantidadDisponible;
    private int cantidadVendida;

    public Especie(String nombre, int vidaPromedio, String claseAnimal, double precioVenta, int cantidadDisponible) {
        this.nombre = nombre;
        this.vidaPromedio = vidaPromedio;
        this.claseAnimal = claseAnimal;
        this.precioVenta = precioVenta;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadVendida = 0;
    }
    //DEFINIR ATRIBUTOS
    public String getNombre() {
        return nombre;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public String getClaseAnimal() {
        return claseAnimal;
    }

    public int getVidaPromedio() {
        return vidaPromedio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida promedio: " + vidaPromedio);
        System.out.println("Clase: " + claseAnimal);
        System.out.println("Precio: $" + precioVenta);
        System.out.println("Disponibles: " + cantidadDisponible);
        System.out.println("Vendidas: " + cantidadVendida);
    }
    public String vender(int cantidad) {//Si la cantidad de venta supera los 50 saldra mensaje
        if (cantidad > 50) {
            return "No se puede vender más de 50 unidades.";
        }
        if (cantidad > cantidadDisponible) {
            return "No hay suficientes mascotas disponibles para la venta.";
        }
        cantidadDisponible -= cantidad;
        cantidadVendida += cantidad;
        return "Venta realizada: " + cantidad + " unidades de " + nombre;
    }
    public String comprar(int cantidad) {//otro condicional que se refiere a la cantidad minima de comprar
        if (cantidad < 5) {
            return "La cantidad mínima para compra es de 5 unidades.";
        }
        cantidadDisponible += cantidad;
        return "Compra realizada: " + cantidad + " unidades de " + nombre;
    }

}


