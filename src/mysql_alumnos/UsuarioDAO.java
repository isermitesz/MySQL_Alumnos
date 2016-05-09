/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_alumnos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author iserm
 */
public class UsuarioDAO {
    public void agregarUsuario(Usuario us) {
        DBConec conn = new DBConec();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO usuarios (nombreUs, password, cveTipo) VALUES('" + us.getNombreUs()+ "', '" +
                    us.getPassword()+ "', " + us.getCveTipo()+ ")";
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Se ha registrado el usuario");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro el usuario " + e);
        }
    }
    
    
    /* ******************************************************************* */
    /* ** Método: guardarUsuario()                                      ** */
    /* ******************************************************************* */
    
        public void guardarUsuario(Usuario us) {
        DBConec conn = new DBConec();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql; 
            sql = "UPDATE usuarios SET nombreUs = '" + us.getNombreUs() + "', password = '" + us.getPassword() + "',";
            sql += " cveTipo = " + us.getCveTipo() + " WHERE cveUsuario = " + us.getCveUsuario();
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Se han guardado los cambios");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se guardaron los cambios " + e);
        }
    }
        
    /* ******************************************************************* */
    /* ** Método: borrarUsuario                                         ** */
    /* ******************************************************************* */
    
        public void borrarUsuario(int cveUsuario) {
        DBConec conn = new DBConec();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "DELETE FROM USUARIOS WHERE cveUsuario = " + cveUsuario; 
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"El usuario se ha borrado");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se borro el usuario " + e);
        }
    }
    
    /* ******************************************************************* */
    /* ** Método: obtenUsuarios()                                       ** */
    /* ******************************************************************* */
        
    public ArrayList<Usuario> obtenUsuarios() {
        ArrayList <Usuario> arrUsuario = new ArrayList<Usuario>();
        DBConec conn = new DBConec();
        String sql = "SELECT * FROM usuarios";
        
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                Usuario us = new Usuario(
                    rs.getInt("cveUsuario"),
                    rs.getString("nombreUs"),
                    rs.getString("password"),
                    rs.getInt("cveTipo")
                );
                arrUsuario.add(us);
            }
            rs.close();
            st.close();
            conn.desconectar();
            
        } catch(Exception e) {
            
        }
        return arrUsuario;
    }
    
}
