package model;

/**
 *
 * Representa la dirección física del dueño de una mascota en PetLovers.
 */
public class Direccion {
    private String calle;
    private String numero; // Se incluye como String por si existe dirección tipo "Calle 52B" o "Calle 24-C"
    private String ciudad;
    private String region;

    /**
     *
     * Constructor de la dirección completa del dueño de una mascota.
     *
     * @param calle  Nombre de la calle.
     * @param numero Número de la calle.
     * @param ciudad Ciudad de la dirección.
     * @param region Región de la dirección.
     */
    public Direccion(String calle, String numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     *
     * Muestra la dirección completa en una línea.
     *
     * @return Dirección completa en una línea.
     */
    public String mostrarDireccion() {
        return calle + ", N° " + numero + ", " + ciudad + ", " + region;
    }

    // Getters y Setters

    /**
     *
     * Obtiene la calle de la dirección.
     *
     * @return Nombre de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     *
     * Establece la calle de la dirección.
     *
     * @param calle Establece el nombre de la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     *
     * Obtiene el número de la calle de la dirección.
     *
     * @return Número de la calle.
     */
    public String getNumero() {
        return numero;
    }

    /**
     *
     * Establece el número de la calle de la dirección.
     *
     * @param numero Establece el número de la calle.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     *
     * Obtiene la ciudad de la dirección.
     *
     * @return Nombre de la ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     *
     * Establece la ciudad de la dirección.
     *
     * @param ciudad Establece la ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     *
     * Obtiene la región de la dirección.
     *
     * @return Nombre de la región.
     */
    public String getRegion() {
        return region;
    }

    /**
     *
     * Establece la región de la dirección.
     *
     * @param region Establece la región.
     */
    public void setRegion(String region) {
        this.region = region;
    }


    @Override
    public String toString() {
        return "Calle: " + calle + ", N°: " + numero + ", Ciudad: " + ciudad + ", Region: " + region;
    }

}
