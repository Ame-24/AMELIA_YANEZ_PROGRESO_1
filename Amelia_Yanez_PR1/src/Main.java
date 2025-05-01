import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();

        int opcion = 0;


        tienda.agregarEspecie(new Especie("Cacatúa Blanca", 40, "Aves", 1500.0, 10));
        tienda.agregarEspecie(new Especie("Boa Constrictor", 80, "Reptil", 1800.0, 20));
        tienda.agregarEspecie(new Especie("Tití Dorado", 20, "Mamifero", 2000.0, 40));
        tienda.agregarEspecie(new Especie("Guacamaya Roja", 30, "Ave", 8000.0, 15));

        System.out.println("Información de especies disponibles:");
        tienda.mostrarEspecies();

        System.out.println("Venta:");
        System.out.println(tienda.venderMascota("Cacatúa Blanca", 4));

        while (opcion != 6) {
            System.out.println("\n--- Tienda Mascotas ---");
            System.out.println("1. Ver información de especies");
            System.out.println("2. Vender especies");
            System.out.println("3. Comprar especies");
            System.out.println("4. Buscar especies");
            System.out.println("5. Buscar especie menos vendida");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}
