
package hotel;

import javax.swing.JOptionPane;

public class Hotel {

    
    public static void main(String[] args) {
   
        
//conexion con constructores
                JOptionPane.showMessageDialog(null, "¡Bienvenido!");
        while (true) {
            //llamando el metodo de opciones principales
            int opciones = mostrarOpcionesPrincipales();

            //Agregar llamados de modulos de cubiculos si hacen falta, etc            
            switch (opciones) {
                case 1 -> //Llamado de opciones por hacer en opcion empleados
                    Piso1.gestionarPiso();
                case 2 -> //Llamado de opciones por hacer en opcion empleados
                    Piso2.gestionarPiso2();

                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Elejiste *salir*");
                    return;
                }

            }
            if (opciones > 3 || opciones < 1) {
                JOptionPane.showMessageDialog(null, "¡Opcion invalida! Verifique que se encuentre entre las opciones");
            }

        }

    }

    //metodo de opciones para poderlo llamar en otras clases
    public static int mostrarOpcionesPrincipales() {
        //menu principal que muestre al recepcionista de la empresa

        return Integer.parseInt(JOptionPane.showInputDialog("Menu principal:\n"
                + " 1. Piso 1 \n "
                + " 2. Piso 2 \n"
                + " 3. Salir"));
    }
        
      
    
    }