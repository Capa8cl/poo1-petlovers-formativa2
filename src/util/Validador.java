package util;

/**
 *
 * Clase auxiliar que contiene métodos de validación para Clínica PetLovers.
 */
public class Validador {

    /**
     *
     * Valida que el texto no esté vacío.
     *
     * @param texto Texto a validar.
     * @return Devuelve true si el texto tiene contenido, devuelve false si está vacío.
     */
    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    /**
     *
     * Valida que la edad sea mayor o igual a cero (se contempla cero por una mascota de meses que no llega a tener 1 año).
     *
     * @param edad Edad de la mascota.
     * @return Devuelve true si la edad es mayor o igual a cero, devuelve false si es menor a cero.
     */
    public static boolean edadValida(int edad) {
        return edad >= 0;
    }

}
