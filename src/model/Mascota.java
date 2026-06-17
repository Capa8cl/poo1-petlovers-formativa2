package model;

/**
 *
 * Representa a la mascota (paciente) de la clínica PetLovers.
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private Duenio duenio;

    /**
     *
     * Constructor para crear la mascota en el sistema con su respectivo dueño.
     *
     * @param nombre  Nombre de la mascota.
     * @param especie Especie de la mascota (Perro, Gato, Conejo, etc).
     * @param edad    Edad en años de la mascota.
     * @param duenio  (Objeto) Dueño de la mascota.
     */
    public Mascota(String nombre, String especie, int edad, Duenio duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.duenio = duenio;
    }

    /**
     *
     * Muestra la información de la mascota, incluido el dueño.
     *
     * @return Datos de la mascota separados por salto de línea.
     */
    public String mostrarMascota() {
        return "---- Datos Mascota ---- " +
                "\nNombre: " + nombre +
                "\nEspecie: " + especie +
                "\nEdad: " + edad + " años" +
                "\n" + duenio.mostrarDuenio();
    }

    // Getters y Setters

    /**
     *
     * Obtiene la edad de la mascota.
     *
     * @return Edad de la mascota.
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * Establece la edad de la mascota.
     *
     * @param edad Establece la edad de la mascota.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * Obtiene la especie de la mascota.
     *
     * @return Especie de la mascota.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     *
     * Establece la especie de la mascota.
     *
     * @param especie Establece la especie de la mascota.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     *
     * Obtiene el nombre de la mascota.
     *
     * @return Nombre de la mascota.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Establece el nombre de la mascota.
     *
     * @param nombre Establece el nombre de la mascota.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Obtiene la Clase del dueño de la mascota.
     *
     * @return Datos del dueño de la mascota.
     */
    public Duenio getDuenio() {
        return duenio;
    }

    /**
     *
     * Establece los datos del dueño de la mascota.
     *
     * @param duenio Establece el dueño de la mascota.
     */
    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "\n---- Datos Mascota (toString) ----\n" +
                "Nombre: " + nombre +
                "\nEspecie: " + especie +
                "\nEdad: " + edad + " años" +
                "\n" + duenio.toString();
    }

}
