# Proyecto: Gestión de Mascotas con Clases Genéricas

## Descripción

Este proyecto implementa un sistema de gestión de mascotas utilizando **clases genéricas** en Java. Los datos de diferentes mascotas, como su nombre y especie, se administran en un inventario genérico que puede manejar cualquier tipo de objeto.

## Tecnologías utilizadas
- Lenguaje de programación: **Java**
- IDE recomendado: **Visual Studio Code**

## Cómo ejecutar el proyecto
1. **Compilar los archivos**:
   ```bash
   javac -d bin src/**/*.java
   ```
2. **Ejecutar el programa**:
   ```bash
   java -cp bin main.Main
   ```

## Estructura del proyecto
ProyectoMascotas
├── src
│   ├── main
│   │   └── Main.java
│   ├── models
│   │   └── Mascota.java
│   └── services
│       └── InventarioGenerico.java
└── README.md
