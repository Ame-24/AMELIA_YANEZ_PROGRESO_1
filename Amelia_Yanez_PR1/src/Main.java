import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();


        tienda.agregarEspecie(new Especie("Cacatúa Blanca", 40, "Aves", 1500.0, 10));
        tienda.agregarEspecie(new Especie("Boa Constrictor", 80, "Reptil", 1800.0, 20));
        tienda.agregarEspecie(new Especie("Tití Dorado", 20, "Mamifero", 2000.0, 40));
        tienda.agregarEspecie(new Especie("Guacamaya Roja", 30, "Ave", 8000.0, 15));

        System.out.println("Información de especies disponibles:");
        tienda.mostrarEspecies();

        System.out.println("Venta:");
        tienda.mostrarEspecies();

    }
