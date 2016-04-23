/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_alumnos;

import java.util.Vector;

/**
 *
 * @author iserm
 */
public class Alumno {
    
    private String noControl;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int semestre;
    
    public Alumno() {
        
    }

    public Alumno(String noControl, String nombre, String apellidoP, String apellidoM, int semestre) {
        this.noControl = noControl;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.semestre = semestre;
    }
    
    
    // Parámetros Set
    public void setNoControl(String strNoControl) {
        this.noControl = strNoControl;
    }
    
    public void setNombre(String strNombre) {
        this.nombre = strNombre;
    }
    
    public void setApellidoP(String strApellidoP) {
        this.apellidoP = strApellidoP;
    }
    
    public void setApellidoM(String strApellidoM) {
        this.apellidoM = strApellidoM;
    }
    
    public void setSemestre(int nSemestre) {
        this.semestre = nSemestre;
    }
    
    // Parámetros Get
    
    public String getNoControl() {
        return noControl;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidoP() {
        return apellidoP;
    }
    
    public String getApellidoM() {
        return apellidoM;
    }
    
    public int getSemestre() {
        return semestre;
    }

    String[] getRow() {
        String [] row = new String[5];
        row[0] = noControl;
        row[1] = nombre;
        row[2] = apellidoP;
        row[3] = apellidoM;
        row[4] = ""+ semestre;
        
        return row;
    }
}
