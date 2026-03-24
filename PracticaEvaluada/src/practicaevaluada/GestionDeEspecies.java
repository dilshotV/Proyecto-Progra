/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada;

import javax.swing.JOptionPane;

/**
 *
 * @author dilsh
 */
public class GestionDeEspecies {

    public static EspecieMarina[] especie = new EspecieMarina[20];
    public static int contador = 0;

    public GestionDeEspecies() {
        especie[contador++] = new EspecieMarina(1, "Oreochromis niloticu", "Tilapia", 20.30, Clasificacion.Pez);

    }

    public static void AgregarEspecie() {
        if (contador < especie.length) {

            int codigo = contador + 1;
            String nombrecientifico = JOptionPane.showInputDialog("nombre cientifico");
            String nombrecomun = JOptionPane.showInputDialog("nombre comun");
            double longitud = Double.parseDouble(JOptionPane.showInputDialog("digite la liongitud de la especie marina"));

            Clasificacion clasificacion[] = Clasificacion.values();
            int seleccion = JOptionPane.showOptionDialog(null, "Clasificacion de la especie", "Clasificacion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, clasificacion, clasificacion[0]);
            Clasificacion clasifica = clasificacion[seleccion];

            especie[contador++] = new EspecieMarina(codigo, nombrecientifico, nombrecomun, longitud, clasifica);
            JOptionPane.showMessageDialog(null, " registrado correctamente");

        } else {
            JOptionPane.showMessageDialog(null, "registro lleno");
        }
    }

    public static void mostrarespecie() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No hay especies registradas");
            return;
        }
        String info = "lista de especies: \n\n";
        for (int i = 0; i < contador; i++) {
            info += especie[i].toString();
            info += "\n";
            info += "--- --- --- --- ---";
            info += "\n";
        }
        JOptionPane.showMessageDialog(null, info);

    }

    public static void buscarrespecie() {
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("digite el codigo de la especie marina"));
        EspecieMarina especiee = null;

        for (int i = 0; i < contador; i++) {
            if (especie[i].getCodigo() == codigo) {
                especiee = especie[i];
                break;
            }

        }
        if (especiee != null) {
            JOptionPane.showMessageDialog(null, especiee.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro por este medio de busqueda");
        }

    }

    public static void editarespecie() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("digite el codigo del animal marino"));
        EspecieMarina especies = null;
        for (int i = 0; i < contador; i++) {
            if (especie[i].getCodigo() == codigo) {
                especies = especie[i];
                break;
            }

        }
        if(especies != null) {
        
            String nombrecientifico = JOptionPane.showInputDialog("nuevo nombre de la especie");
            especies.setNombreCientifico(nombrecientifico);
            
            JOptionPane.showMessageDialog(null, "nombrecientifico actualizado correctamente");
            
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el videojuego");
        }
        
        }
        
        
        }
    

