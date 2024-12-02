package main;

import models.Mascota;
import services.InventarioGenerico;

public class Main {
    public static void main(String[] args) {
        // Crear un inventario para Mascotas
        InventarioGenerico<Mascota> inventarioMascotas = new InventarioGenerico<>();

        // Agregar mascotas al inventario
        inventarioMascotas.agregar(new Mascota("Max", "Perro"));
        inventarioMascotas.agregar(new Mascota("Luna", "Gato"));
        inventarioMascotas.agregar(new Mascota("Coco", "Ave"));

        // Mostrar todas las mascotas en el inventario
        System.out.println("Inventario de mascotas:");
        inventarioMascotas.obtenerTodos().forEach(System.out::println);
    }
}
