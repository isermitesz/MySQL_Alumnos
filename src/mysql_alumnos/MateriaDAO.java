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
public class MateriaDAO {
    
        public void agregarMateria(Materia mat) {
        DBConec conn = new DBConec();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO materias VALUES('" + mat.getCveMateria()+ "', '" +
                    mat.getNomMateria()+ "', " + mat.getCreditos()+ ", " + mat.getCveCarrera() + ")";
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Se ha registrado la materia");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se registro la persona " + e);
        }
    }
        
    public ArrayList<Materia> obtenMaterias() {
        ArrayList <Materia> arrMateria = new ArrayList<Materia>();
        DBConec conn = new DBConec();
        String sql = "SELECT * FROM materias";
        
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                Materia mat = new Materia(
                    rs.getString("cveMateria"),
                    rs.getString("nomMateria"),
                    rs.getInt("creditos"),
                    rs.getInt("cveCarrera")
                );
                arrMateria.add(mat);
            }
            rs.close();
            st.close();
            conn.desconectar();
            
        } catch(Exception e) {
            
        }
        return arrMateria;
    }
    
}
