
package hotel;

import javax.swing.JOptionPane;

public class Piso1 {
    //Atributos
   
    Habitacion[][] piso1 = new Habitacion[6][3]; // Arreglo de Habitacion
     
    // Constructores
    public Piso1(){
  
    }
  
    // Get y set
    public Habitacion[][] getPiso1() {
        return piso1;
    }

    public void setPiso1(Habitacion[][] piso1) {
        this.piso1 = piso1;
    }
    
    //Metodo
    public static boolean gestionarPiso() {
  
        Habitacion[][] piso1 = new Habitacion[6][3]; // Arreglo de Habitacion
        // Inicializar las habitaciones del piso con el estado "libre"
        for (Habitacion[] piso11 : piso1) {
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
                                if (fila < piso1.length && columna < piso1[0].length)
                                    if (!piso1[fila][columna].isEstado()) { // Verificar si está libre
                                        int precioNoche = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio por noche:"));
                                        int numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitacion:"));
                                        boolean estado = true; // La habitación ahora está ocupada
                                        piso1[fila][columna] = new Habitacion(precioNoche, numeroHabitacion, estado);
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
                                for (Habitacion[] piso11 : piso1) {
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



     

