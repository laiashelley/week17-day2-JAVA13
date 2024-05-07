public class Comida {

    // Se propone que sean objetos Comida: nombre, origen, peso, precio.

    private String nombre;
    private String origen;
    private double peso;
    private double precio;

    public Comida() {
    }

    public Comida(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return 
        "Nombre: " + getNombre();
    }

}