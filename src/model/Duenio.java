package model;

/**
 *
 * Representa al dueño de de una mascota en PetLovers.
 */
public class Duenio {
    private String nombre;
    private String telefono;
    private Direccion direccion;

    /**
     *
     * Constructor de la información del dueño de una mascota de PetLovers.
     *
     * @param nombre    Nombre del dueño de una mascota.
     * @param telefono  Teléfono del dueño de una mascota.
     * @param direccion (Objeto) Dirección del dueño de una mascota.
     */
    public Duenio(String nombre, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     *
     * Muestra la información del dueño.
     *
     * @return Datos del dueño separados por salto de línea.
     */
    public String mostrarDuenio() {
        return "\n---- Datos Dueño ----\n" + "Nombre dueño: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + direccion.mostrarDireccion();
    }

    // Getters y Setters

    /**
     *
     * Obtiene el nombre del dueño.
     *
     * @return Nombre del dueño.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Establece el nombre del dueño.
     *
     * @param nombre Establece el nombre del dueño.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Obtiene el teléfono del dueño.
     *
     * @return Teléfono del dueño.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * Establece el teléfono del dueño.
     *
     * @param telefono Establece el teléfono del dueño.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * Obtiene la dirección del dueño.
     *
     * @return Dirección del dueño.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     *
     * Establece la dirección del dueño.
     *
     * @param direccion Establece la dirección del dueño.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\n---- Datos Dueño (toString) ----" + "\nNombre dueño: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + direccion;
    }
}
