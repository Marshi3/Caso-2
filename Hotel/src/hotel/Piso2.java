
package hotel;

import javax.swing.JOptionPane;


public class Piso2 {

    //Atributos
   
    Habitacion[][] piso2 = new Habitacion[6][3]; // Arreglo de Habitacion
     
    // Constructores
    public Piso2(){
  
    }
    
  
    // Get y set
   
    public Habitacion[][] getPiso2() {
        return piso2;
    }

    public void setPiso2(Habitacion[][] piso2) {
        this.piso2 = piso2;
    }
    
    //Metodo
    public static boolean gestionarPiso2() {
  
        Habitacion[][] piso2 = new Habitacion[6][3]; // Arreglo de Habitacion
        // Inicializar las habitaciones del piso con el estado "libre"
        for (Habitacion[] piso11 : piso2) {
            for (int j = 0; j < piso11.length; j++) {
                piso11[j] = new Habitacion(0, 0, false); // Las habitaciones están libres inicialmente
            }
        }

      
        while (true) {
            int habitacionOpciones = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                  Opciones del piso: 
                                                                                  1. Reservar
                                                                                  2. Visualizar espacios
                                                                                  3. Regresar"""));

            switch (habitacionOpciones) {
                case 1 -> {
                    // Reserva
                    while (true) {
                        int habitacionReserva = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                             Piso 1, habitaciones:
                                                                                             1. Reservar habitacion
                                                                                             2. Regresar"""));
                        switch (habitacionReserva) {
                            case 1 -> {
                                int fila = Integer.parseInt(JOptionPane.showInputDialog("Digite la fila que se encuentra: "));
                                int columna = Integer.parseInt(JOptionPane.showInputDialog("Digite la columna que se encuentra: "));
                                if (fila < piso2.length && columna < piso2[0].length)
                                    if (!piso2[fila][columna].isEstado()) { // Verificar si está libre
                                        int precioNoche = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio por noche:"));
                                        int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitacion:"));
                                        boolean estado = true; // La habitación ahora está ocupada
                                        piso2[fila][columna] = new Habitacion(precioNoche, numeroHabitacion, estado);
                                        JOptionPane.showMessageDialog(null, "¡Espacio asignado exitosamente!");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "¡Espacio ocupado!");
                                    }
                            }
                        }
                        
                        if (habitacionReserva > 2 || habitacionReserva < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");
                        }
                        if (habitacionReserva == 2) {
                            break;
                        }
                    }
                }
                case 2 -> {
                    // Visualizar
                    while (true) {
                        int habitacionVisualizar = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                        Piso 1, visualizar habitaciones:
                                                                                                                        1. Habitaciones
                                                                                                                        2. Regresar"""));
                        switch (habitacionVisualizar) {
                            case 1 -> {
                                String mostrarEspacios1 = "";
                                for (Habitacion[] piso11 : piso2) {
                                    for (Habitacion piso111 : piso11) {
                                        mostrarEspacios1 += piso111.toString() + "   ";
                                    }
                                    mostrarEspacios1 += "\n";
                                }
                                JOptionPane.showMessageDialog(null, "Habitaciones del piso 1:\n" + mostrarEspacios1);
                            }
                        }
                        if (habitacionVisualizar > 2 || habitacionVisualizar < 1) {
                            JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");
                        }
                        if (habitacionVisualizar == 2) {
                            break;
                        }
                    }
                }
            }

            if (habitacionOpciones > 3 || habitacionOpciones < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");
            }
            if (habitacionOpciones == 3) {
                break;
            }
        }
        return true;
    }
}


