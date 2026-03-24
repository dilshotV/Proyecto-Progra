/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada;

import javax.swing.JOptionPane;

/**
 *
 * @author dilsh
 */
public class PracticaEvaluada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         GestionDeEspecies gestor = new GestionDeEspecies();
        
        int opcion = 0;
        
        do {
        
            String opciones[] = {"Agregar especie","Mostrar especies","Buscar especies","Editar especies","salir"};
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion del sistema de gestion de especies marinas",
                                                "Videojuegos Fide!", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                                                null, opciones, opciones[0]);
            
            switch(opcion) {
                case 0:
                  gestor.AgregarEspecie();
                    break;
                case 1:
                    gestor.mostrarespecie();
                    break;
                case 2:
                   gestor.buscarrespecie();
                    break;            
                case 3:
                    gestor.editarespecie();
                    break; 

            }
            
        } while(opcion != 4);
    }
    
}
