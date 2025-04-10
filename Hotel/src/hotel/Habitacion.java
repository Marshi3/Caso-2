
package hotel;


public class Habitacion {
    private int precioNoche;
    private boolean estado;
    private int numeroHabitacion;
    private boolean doble;
    private boolean simple;

    public Habitacion(int precioNoche, int numeroHabitacion, boolean doble) {
        this.precioNoche = precioNoche;
        this.estado = estado;
        this.numeroHabitacion = numeroHabitacion;
        this.doble = doble;
        this.simple = simple;
    }

    public Habitacion() {
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isDoble() {
        return doble;
    }

    public void setDoble(boolean doble) {
        this.doble = doble;
    }

    public boolean isSimple() {
        return simple;
    }

    public void setSimple(boolean simple) {
        this.simple = simple;
    }

    public boolean isEstado() {
        return estado;
    }
    
    // Método para mostrar el estado de la habitación
    @Override
    public String toString() {
        return "Habitacion " + numeroHabitacion + " - Precio: " + precioNoche + " - Estado: " + (estado ? "Ocupada" : "Libre");
    }
    
}


