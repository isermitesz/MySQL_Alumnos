/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_alumnos;

/**
 *
 * @author iserm
 */
public class Materia {
    private String cveMateria;
    private String nomMateria;
    private int creditos;
    private int cveCarrera;

    public Materia(String cveMateria, String nomMateria, int creditos, int cveCarrera) {
        this.cveMateria = cveMateria;
        this.nomMateria = nomMateria;
        this.creditos = creditos;
        this.cveCarrera = cveCarrera;
    }
    
    // Métodos Set
    public void setCveMateria(String strCveMateria) {
        this.cveMateria = strCveMateria;
    }
    
   public void setNomMateria(String strNomMateria) {
       this.nomMateria = strNomMateria;
   } 
    
   public void setCreditos(int nCreditos) {
       this.creditos = nCreditos;
   } 
   
   public void setCveCarrera(int nCarrera) {
       this.cveCarrera = nCarrera;
   } 
   
   // Métodos Get
   
   public String getCveMateria() {
        return cveMateria;
    }
   
   public String getNomMateria() {
        return nomMateria;
    }
   
   public int getCreditos() {
        return creditos;
    }
   
   public int getCveCarrera() {
        return cveCarrera;
    }
   
   String[] getRow() {
       String [] row = new String[5];
       row[0] = "cveMateria";
       row[1] = "nomMateria";
       row[2] = ""+creditos;
       row[3] = ""+cveCarrera;
       
       return row;
   }
}
