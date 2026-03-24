/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada;

/**
 *
 * @author dilsh
 */
public class EspecieMarina {
    private int codigo;
    private String NombreCientifico;
    private String Nombrecomun;
    private double Longitud;
    private Clasificacion clasificacion;

    public EspecieMarina(int codigo, String NombreCientifico, String Nombrecomun, double Longitud, Clasificacion clasificacion) {
        this.codigo = codigo;
        this.NombreCientifico = NombreCientifico;
        this.Nombrecomun = Nombrecomun;
        this.Longitud = Longitud;
        this.clasificacion = clasificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCientifico() {
        return NombreCientifico;
    }

    public void setNombreCientifico(String NombreCientifico) {
        this.NombreCientifico = NombreCientifico;
    }

    public String getNombrecomun() {
        return Nombrecomun;
    }

    public void setNombrecomun(String Nombrecomun) {
        this.Nombrecomun = Nombrecomun;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Codigo = "+ codigo + "\n"+
                "nombre cientifico = "+ NombreCientifico + "\n"+
                "nombre comun = "+ Nombrecomun + "\n"+
                "longitud = "+ Longitud + "\n"+
                "clasificacion = "+ clasificacion ;
    }
    

    
}
