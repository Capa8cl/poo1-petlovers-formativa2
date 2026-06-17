package app;

import model.Direccion;
import model.Duenio;
import model.Mascota;
import util.Validador;

/**
 *
 * Sistema de registro de mascotas para Clínica Veterinaria PetLovers, Valdivia.
 *
 * @author Fabrizio Fernandini.
 * @version 1.0
 * @see "Tutorial de referencia donde se generó JavaDoc en HTML."
 * @see <a href="https://www.youtube.com/watch?v=fWqyzU6Ba7A">Cómo generar JavaDocs desde IntelliJ o la línea de comandos.</a>
 */

public class Main {

    /**
     *
     * Clase principal del sistema de registro de mascotas.
     *
     * @param args Argumentos.
     */
    public static void main(String[] args) {
        // Instancia de la dirección del dueño de la mascota 1
        Direccion direccion1 = new Direccion("Av. Pedro Montt", "2030", "Valdivia", "Los Ríos");

        // Instancia del dueño de la mascota 1
        Duenio duenio1 = new Duenio("Luis Pérez", "+569 4321 5678", direccion1);

        // Instancia de la mascota 1
        Mascota mascota1 = new Mascota("Barto", "Perro", 8, duenio1);

        // Validar textos vacíos dirección
        if (Validador.textoValido(direccion1.getCalle())
                && Validador.textoValido(direccion1.getNumero()) &&
                Validador.textoValido(direccion1.getCiudad()) &&
                Validador.textoValido(direccion1.getRegion())) {
            System.out.println("La dirección es válida.");

            // Validar textos vacíos dueño
            if (Validador.textoValido(duenio1.getNombre()) &&
                    Validador.textoValido(duenio1.getTelefono())) {
                System.out.println("Los campos del dueño son válidos.");

                // Validar textos vacíos mascota
                if (Validador.textoValido(mascota1.getNombre()) &&
                        Validador.textoValido(mascota1.getEspecie())) {
                    System.out.println("Los campos Nombre y Especie de la mascota son válidos.");

                    // Validar edad
                    if (Validador.edadValida(mascota1.getEdad())) {
                        System.out.println("La edad es válida.\n");
                        // Mostrar información de la mascota 1 si los datos son válidos
                        System.out.println(mascota1.mostrarMascota());

                        // Mostrar la salida usando toString
                        System.out.println("\n**** Salida usando método toString() solicitado en la rúbrica ****");
                        System.out.println(mascota1.toString());
                    } else {
                        System.out.println("La edad es un número menor a cero, debe ser mayor.");
                    }
                } else {
                    System.out.println("Hay textos vacíos en Nombre y/o Especie.");
                }
            } else {
                System.out.println("Hay textos vacíos en el dueño.");
            }
        } else {
            System.out.println("Hay textos vacíos en la dirección.");
        }


    }

}
