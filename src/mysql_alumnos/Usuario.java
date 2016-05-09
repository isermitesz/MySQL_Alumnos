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
public class Usuario {
    private int cveUsuario;
    private String nombreUs;
    private String password;
    private int cveTipo;

    public Usuario() {
    }
    
    

    public Usuario(int cveUsuario, String nombreUs, String password, int cveTipo) {
        this.cveUsuario = cveUsuario;
        this.nombreUs = nombreUs;
        this.password = password;
        this.cveTipo = cveTipo;
    }
    
    // Parámetros Set
    public void setNombreUs(String strNombreUs) {
        this.nombreUs = strNombreUs;
    }
    
    public void setPassword(String strPassword) {
        this.password = strPassword;
    }
    
    public void setCveTipo(int nCveTipo) {
        this.cveTipo = nCveTipo;
    }
    
    // Parámetros Get
    
    public int getCveUsuario() {
        return cveUsuario;
    }
    
    public String getNombreUs() {
        return nombreUs;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int getCveTipo() {
        return cveTipo;
    }
    
    String[] getRow() {
        String [] row = new String[3];
        row[0] = ""+cveUsuario;
        row[1] = nombreUs;
        row[2] = ""+cveTipo;
        
        return row;
    }
}
